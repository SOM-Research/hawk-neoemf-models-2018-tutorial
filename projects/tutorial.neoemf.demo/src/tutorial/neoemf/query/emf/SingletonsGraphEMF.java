package tutorial.neoemf.query.emf;

import static java.util.Objects.nonNull;
import static tutorial.neoemf.util.QueryUtil.endQuery;
import static tutorial.neoemf.util.QueryUtil.getAllInstances;
import static tutorial.neoemf.util.QueryUtil.startQuery;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Core.CorePackage;
import DOM.BodyDeclaration;
import DOM.DOMPackage;
import DOM.ExtendedModifier;
import DOM.MethodDeclaration;
import DOM.Modifier;
import DOM.SimpleType;
import DOM.TypeDeclaration;
import PrimitiveTypes.PrimitiveTypesPackage;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.neoemf.util.logging.NeoLogger;

public class SingletonsGraphEMF {
	
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
		
		List<TypeDeclaration> results = new ArrayList<>();
		
		startQuery();
		
		/*
		 * Use the standard EMF API to navigate in the model and retrieve singleton TypeDeclarations.
		 * Note: NeoEMF implements the full EMF API, and we put a special attention to ensure that calling a NeoEMF method 
		 * produces the same behavior (including possible side-effects) as standard EMF API calls.
		 */
		List<TypeDeclaration> typeDeclarations = getAllInstances(graphResource, TypeDeclaration.class);
		for(TypeDeclaration td : typeDeclarations) {
			List<BodyDeclaration> bodyDeclarations = td.getBodyDeclarations();
			for(BodyDeclaration bd : bodyDeclarations) {
				if(bd instanceof MethodDeclaration) {
					MethodDeclaration md = (MethodDeclaration)bd;
					if(nonNull(md.getReturnType()) && md.getReturnType() instanceof SimpleType && ((SimpleType)md.getReturnType()).getName().getFullyQualifiedName().equals(td.getName().getFullyQualifiedName())) {
						List<ExtendedModifier> modifiers = md.getModifiers();
						if(modifiers.stream().anyMatch(exMod -> exMod instanceof Modifier && ((Modifier)exMod).getPublic() == true) &&
								modifiers.stream().anyMatch(exMod -> exMod instanceof Modifier && ((Modifier)exMod).getStatic() == true )) {
							results.add(td);
						}
					}
				}
			}
		}
				
		NeoLogger.info("Found {0} singletons", results.size());
		
		endQuery();
		
		((PersistentResource)graphResource).close();
	}
}
