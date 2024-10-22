package tutorial.neoemf.demo.counter;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Core.CorePackage;
import DOM.DOMPackage;
import PrimitiveTypes.PrimitiveTypesPackage;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.neoemf.util.logging.NeoLogger;

import static tutorial.neoemf.util.QueryUtil.startQuery;
import static tutorial.neoemf.util.QueryUtil.endQuery;

public class MapCounter {
	
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
		
		startQuery();
		
		Iterator<EObject> it = mapResource.getAllContents();
		int counter = 0;
		while(it.hasNext()) {
			EObject eObject = it.next();
			counter++;
		}
		
		NeoLogger.info("Resource {0} contains {1} elements", mapResource.getURI().toString(), counter);
		
		endQuery();
		
		((PersistentResource)mapResource).close();
	}

}
