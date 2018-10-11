package tutorial.neoemf.demo.importer;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

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

public class StandardGraphImporter {
	
	public static void main(String[] args) throws IOException {
		/*
		 * Registers the EPackages corresponding to the model to import.
		 */
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		/*
		 * Registers the PersistenceBackendFactory that manages the underlying database.
		 * NeoEMF uses custom protocols to identify the concrete database implementation to use to store the model. Registering protocols can be
		 * done through the resource factory registry. Each concrete database implementation provides a <Database>URI.SCHEME convenience value that 
		 * can be used to register the database.
		 * Note: this initialization step will not be required in future releases.
		 */
		PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		/*
		 * Registers the XMI extension and the Blueprints protocol.
		 * NeoEMF custom protocols are also used to choose the ResourceFactory to use when creating/loading a resource. 
		 */
		NeoLogger.info("Loading the XMI model");
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
		
		Resource xmiResource = rSet.createResource(URI.createFileURI("../tutorial.common/models/set3/set3.xmi"));
		xmiResource.load(Collections.emptyMap());
		
		Resource graphResource = rSet.createResource(BlueprintsURI.createFileURI(new File("models/set3.graphdb")));
		
		/*
		 * Each concrete database implementation provides an OptionsBuilder that allows to customize the modeling framework options 
		 * as well as the underlying database. The OptionsBuilder produces an option Map that can be passed to EMF Resource save() 
		 * and load() methods.
		 */
		Map<String, Object> graphOptions = BlueprintsNeo4jOptionsBuilder.newBuilder()
				/*
				 * Modeling framework options
				 */
				.autocommit() // auto-commit opened transactions (reduces memory consumption)
				// .cacheFeatures() // cache accessed features
				// .cacheIsSet() // cache isSet() method results
				// .cacheSizes() // cache size() method results
				/*
				 * Database options
				 */
				// .weakCache() // use a weak database cache (reduces memory consumption, slows down the execution)
				//.softCache() // use a soft database cache *default caching strategy* (increases memory consumption, improves execution time)
				// .nodesMappedBuffer(size) // customize the size of the database node store
				// .relationshipsMappedBuffer(size) // customize the size of the database relationship store
				// .arraysMappedBuffer(size) // customize the size of the database arrays store
				// .propertiesMappedBuffer(size) // customize the size of the database properties store
				// .stringsMappedBuffer(size) // customize the size of the database strings store
				.asMap();
		
		/*
		 * Save the resource before using it to customize the underlyind database
		 */
		graphResource.save(graphOptions);
		
		startQuery();
		
		graphResource.getContents().addAll(xmiResource.getContents());
		
		/*
		 * Save the updated resource
		 * Note: if the *autocommit* option has been set, calling save() will persist the currently opened transaction. Previous transactions have been automatically persisted.
		 */
		graphResource.save(graphOptions);
		
		endQuery();
		
		NeoLogger.info("XMI model {0} migrated to {1}", xmiResource.getURI().toString(), graphResource.getURI().toString());
		
		/*
		 * Shutdown the underlying database.
		 * Note: calling close() is a good practice but is not mandatory, there is a shutdownHook that will take care of closing resources when shutting down the JVM.
		 */
		((PersistentResource)graphResource).close();
	}

}
