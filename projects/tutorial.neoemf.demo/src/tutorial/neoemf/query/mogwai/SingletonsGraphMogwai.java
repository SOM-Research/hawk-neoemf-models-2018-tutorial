package tutorial.neoemf.query.mogwai;

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
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;

public class SingletonsGraphMogwai {
	
	public static void main(String[] args) throws IOException {
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		PersistenceBackendFactoryRegistry.register(MogwaiURI.MOGWAI_SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(MogwaiURI.MOGWAI_SCHEME, MogwaiResourceFactory.getInstance());
		
		Resource graphResource = rSet.createResource(MogwaiURI.createMogwaiURI(new File("models/set1.graphdb")));
		Map<String, Object> graphOptions = BlueprintsNeo4jOptionsBuilder.newBuilder().asMap();
		graphResource.load(graphOptions);
		
		/*
		 * Cast to access the Mogwaï API
		 */
		MogwaiResource mogwaiResource = (MogwaiResource)graphResource;
		
		MogwaiQuery query = OCLQueryBuilder.newBuilder()
				.fromURI(URI.createURI("ocl/singletons.ocl"))
				.build();
		
		Map<String, Object> qOptions = new HashMap<String, Object>();
		qOptions.put(GremlinScriptRunner.PRINT_SCRIPT_OPTION, true);
		
		QueryResult result = mogwaiResource.query(query, qOptions);
		
		System.out.println("Found " + result.resultSize() + " singletons");
		
		((PersistentResource)graphResource).close();
	}
}
