package tutorial.neoemf.query.mogwai;

import static tutorial.neoemf.util.QueryUtil.endQuery;
import static tutorial.neoemf.util.QueryUtil.startQuery;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Core.CorePackage;
import DOM.DOMPackage;
import PrimitiveTypes.PrimitiveTypesPackage;
import fr.inria.atlanmod.mogwai.neoemf.resource.MogwaiResource;
import fr.inria.atlanmod.mogwai.neoemf.resource.MogwaiResourceFactory;
import fr.inria.atlanmod.mogwai.neoemf.util.MogwaiURI;
import fr.inria.atlanmod.mogwai.processor.GremlinScriptRunner;
import fr.inria.atlanmod.mogwai.query.MogwaiQuery;
import fr.inria.atlanmod.mogwai.query.QueryResult;
import fr.inria.atlanmod.mogwai.query.builder.OCLQueryBuilder;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.util.logging.NeoLogger;

public class SingletonsGraphMogwai {
	
	public static void main(String[] args) throws IOException {
		/*
		 * Registers the EPackages corresponding to the model to import.
		 */
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		/*
		 * Registers the PersistenceBackendFactory using the dedicated MOGWAI_SCHEME custom protocol.
		 */
		PersistenceBackendFactoryRegistry.register(MogwaiURI.MOGWAI_SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		ResourceSet rSet = new ResourceSetImpl();
		/*
		 * Registers a dedicated MogwaiResourceFactory and binds it to the MOGWAI_SCHEME custom protocol.
		 * The MogwaiResourceFactory creates MogwaiResource instances, that provide an advanced querying and transformation API
		 * based on the Mogwaï translation approach.
		 */
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(MogwaiURI.MOGWAI_SCHEME, MogwaiResourceFactory.getInstance());
		
		Resource graphResource = rSet.createResource(MogwaiURI.createMogwaiURI(new File("models/set1.graphdb")));
		Map<String, Object> graphOptions = BlueprintsNeo4jOptionsBuilder.newBuilder().asMap();
		graphResource.load(graphOptions);
		
		/*
		 * Cast to MogwaiResource to access the Mogwaï querying API
		 */
		MogwaiResource mogwaiResource = (MogwaiResource)graphResource;
		
		/*
		 * Use the Mogwaï query builder to create MogwaiQuery instances that can be handled by the MogwaiResource.
		 * Mogwaï provides 3 query builders: 
		 * - OCLQueryBuilder: that wraps OCL constraints and queries and translates them to Gremlin database queries
		 * - ATLQueryBuilder: that wraps ATL transformations and translates them to generic, multi-database queries (experimental feature)
		 * - GremlinQueryBuilder: that allows to compute plain Gremlin queries on the underlying database.
		 */
		MogwaiQuery query = OCLQueryBuilder.newBuilder()
				.fromURI(URI.createURI("ocl/singletons.ocl"))
				.build();
		
		/*
		 * Set specific options for the MogwaiQuery translation and execution.
		 * PRINT_SCRIPT_OPTION will log the result of the query translation (i.e. the concrete Gremlin query to execute) to the console.
		 */
		Map<String, Object> qOptions = new HashMap<String, Object>();
		qOptions.put(GremlinScriptRunner.PRINT_SCRIPT_OPTION, true);
		
		startQuery();
		
		/*
		 * Use the query() API method to translate and compute the input OCL query.
		 */
		QueryResult result = mogwaiResource.query(query, qOptions);
		
		NeoLogger.info("Found {0} singletons", result.resultSize());
		
		endQuery();
		
		((PersistentResource)graphResource).close();
	}
}
