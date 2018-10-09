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
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.neoemf.util.logging.NeoLogger;

public class SingletonsMapEMF {
	
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
		
		List<TypeDeclaration> results = new ArrayList<>();
		
		startQuery();
		
		List<TypeDeclaration> typeDeclarations = getAllInstances(mapResource, TypeDeclaration.class);
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
		
		((PersistentResource)mapResource).close();
	}
}
