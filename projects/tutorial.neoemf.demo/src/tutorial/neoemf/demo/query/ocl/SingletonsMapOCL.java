package tutorial.neoemf.demo.query.ocl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;

import Core.CorePackage;
import DOM.DOMPackage;
import PrimitiveTypes.PrimitiveTypesPackage;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;

public class SingletonsMapOCL {
	
	public static void main(String[] args) throws IOException {
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		PersistenceBackendFactoryRegistry.register(MapDbURI.SCHEME, MapDbPersistenceBackendFactory.getInstance());
		
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(MapDbURI.SCHEME, PersistentResourceFactory.getInstance());
		
		Resource mapResource = rSet.createResource(MapDbURI.createFileURI(new File("models/set1.mapdb")));
		Map<String, Object> mapOptions = MapDbOptionsBuilder.newBuilder().asMap();
		mapResource.load(mapOptions);
		
		try {
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLInput oclInput = new OCLInput(new FileInputStream(new File("ocl/singletons.ocl")));
			List<Constraint> constraints = ocl.parse(oclInput);
			List<EObject> result = (List<EObject>)ocl.createQuery(constraints.get(0)).evaluate(mapResource.getContents().get(0));
			System.out.println("Found " + result.size() + " singletons");
		} catch(ParserException e) {
			System.out.println("Cannot parse the input OCL file");
			e.printStackTrace();
		}
		
		((PersistentResource)mapResource).close();
	}
}
