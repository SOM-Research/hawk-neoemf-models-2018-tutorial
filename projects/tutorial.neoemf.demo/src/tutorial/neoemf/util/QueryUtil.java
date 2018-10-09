package tutorial.neoemf.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.neoemf.util.logging.NeoLogger;

public class QueryUtil {

	private static long startTimer;
	
	private static long endTimer;
	
	private static long startMemory;
	
	private static long endMemory;
	
	public static void startQuery() {
		for(int i = 0; i < 5; i++) {
			System.gc();
		}
		startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		startTimer = System.currentTimeMillis();
	}
	
	public static void endQuery() {
		endTimer = System.currentTimeMillis();
		for(int i = 0; i < 5; i++) {
			System.gc();
		}
		endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		NeoLogger.info("Query executed in {0}ms (memory consumption {1}MB)", (endTimer - startTimer), ((endMemory - startMemory)/(1024*1024)));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> getAllInstances(Resource resource, Class<T> clazz) {
		List<T> results = new ArrayList<>();
		Iterator<EObject> it = resource.getAllContents();
		while(it.hasNext()) {
			EObject eObject = it.next();
			if(clazz.isInstance(eObject)) {
				results.add((T)eObject);
			}
		}
		return results;
		
	}
	
}
