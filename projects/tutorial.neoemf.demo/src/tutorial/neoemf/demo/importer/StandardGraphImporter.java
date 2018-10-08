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

public class StandardGraphImporter {
	
	public static void main(String[] args) throws IOException {
		CorePackage.eINSTANCE.eClass();
		DOMPackage.eINSTANCE.eClass();
		PrimitiveTypesPackage.eINSTANCE.eClass();
		
		PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
		
		/*
		 * Load the XMI file
		 */
		Resource xmiResource = rSet.createResource(URI.createFileURI("../tutorial.common/models/set1/set1.xmi"));
		xmiResource.load(Collections.emptyMap());
		
		Resource graphResource = rSet.createResource(BlueprintsURI.createFileURI(new File("models/set1.graphdb")));
		Map<String, Object> graphOptions = BlueprintsNeo4jOptionsBuilder.newBuilder().asMap();
		graphResource.save(graphOptions);
		
		graphResource.getContents().addAll(xmiResource.getContents());
		
		graphResource.save(graphOptions);
		
		((PersistentResource)graphResource).close();
	}

}
