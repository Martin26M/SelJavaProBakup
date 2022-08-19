package CollectionsHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HAshMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// There is no indexing in Maps
		// The values as stored as key and value
		//
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Kerala", 1);
		map.put("TN", 2);
		map.put("KA", 3);
		
		//System.out.println(map.get("Kerala"));
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.get("KA"));
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Iterating over the keys 
		
	Iterator<String> keysets= 	map.keySet().iterator();
//		
//		while (keysets.hasNext()) {
//			
//			
//		String key= 	keysets.next();
//			System.out.println(map.get(key));
		
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Iterating over the key value pair
		

	
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			
			
			Entry<String, Integer> entry= 	it.next();
			
			System.out.println(entry.getKey()+"="+ entry.getValue());
			
		}
		
		}
		
	
	// Note >>>>>>>>>>>>>>>>> Null Key can be created only once in HasMap , it will not give any error but replace the value with the latest value if duplicate null  is created
	// Note >>>> Multiple Null Values are allowed 
	}


