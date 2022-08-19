package CollectionsHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ComparingHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer, String> map = new 	HashMap <Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		
		HashMap <Integer, String> map1 = new 	HashMap <Integer, String>();
		
		map1.put(1, "C");
		map1.put(2, "B");
		map1.put(3, "A");
		
        HashMap <Integer, String> map2 = new 	HashMap <Integer, String>();
		
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		
		// Comparision on the basis of key value (Only the key values are compared)
		
		
		System.out.println(map.equals(map2));
		System.out.println(map.equals(map1));// Here the key values held by the keys are different 
		
		// Comparision on the basis of same  keys  (only the keys are compared)
		
		System.out.println(map.keySet().equals(map1.keySet()));// Here both the key sets of both maps are same 
		System.out.println(map.keySet().equals(map2.keySet()));// Here as well both the key sets of both maps are same 
	
		
		// To find extra keys when compared to 2 sets 
	
		
	HashMap <Integer, String> map3 = new 	HashMap <Integer, String>();
		
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		
		
		//1.We will combine the keys 
		
		Set<Integer> combinekeys = new HashSet<Integer>(map.keySet());
		combinekeys.addAll(map3.keySet());
		combinekeys.removeAll(map.keySet());
		System.out.println(combinekeys);
		
	}

}
