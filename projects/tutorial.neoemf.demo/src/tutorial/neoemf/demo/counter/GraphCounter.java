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
import fr.inria.atlanmod.neoemf.util.logging.NeoLogger;

import static tutorial.neoemf.util.QueryUtil.startQuery;
import static tutorial.neoemf.util.QueryUtil.endQuery;

public class GraphCounter {
	
	public static void main(String[] args) throws IOException {
		/*
		 * Registers the EPackages corresponding to the model to import.
		 */
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
		
		Resource graphResource = rSet.createResource(BlueprintsURI.createFileURI(new File("models/set1.graphdb")));
		Map<String, Object> graphOptions = BlueprintsNeo4jOptionsBuilder.newBuilder().asMap();
		graphResource.load(graphOptions);
		
		startQuery();
		
		/*
		 * Perform a full traversal of the model and count the number of elements it contains.
		 * If the *weakCache* option is set, database records representing EObjects will be garbage-collected after each operation,
		 * limiting the memory consumption, but increasing the execution time.
		 * If the *softCache* option is set, database records representing EObjects will stay longer in memory (until the JVM needs to free space),
		 * speeding up execution at the cost of an increased memory consumption (default option).
		 */
		Iterator<EObject> it = graphResource.getAllContents();
		int counter = 0;
		while(it.hasNext()) {
			EObject eObject = it.next();
			counter++;
		}
		
		NeoLogger.info("Resource {0} contains {1} elements", graphResource.getURI().toString(), counter);
		
		endQuery();
		
		((PersistentResource)graphResource).close();
	}

}
