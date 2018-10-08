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
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;

public class GraphCounter {
	
	public static void main(String[] args) throws IOException {
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
		
		Resource graphResource = rSet.createResource(BlueprintsURI.createFileURI(new File("models/set1.graphdb")));
		Map<String, Object> graphOptions = BlueprintsNeo4jOptionsBuilder.newBuilder().asMap();
		graphResource.load(graphOptions);
		
		Iterator<EObject> it = graphResource.getAllContents();
		int counter = 0;
		while(it.hasNext()) {
			EObject eObject = it.next();
			counter++;
		}
		
		System.out.println("Resource " + graphResource.getURI().toString() + " contains " + counter + " elements");
		
		((PersistentResource)graphResource).close();
	}

}
