package CollectionsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class CopyOnWriteArrayList {

	public static void main(String[] args) {
	
		
		
//  Thread Safe ArrayList >>> CopyOnWriteArrayList
		
		List<String> list =  Collections.synchronizedList(new ArrayList<String>());
		
		
		
		list.add("Martin");
		list.add("Mathew");
		
		//We dont need synchronized keyword for add /remmove but for traversing we will have to use synchronized keyword
		
		synchronized (list){
			
			Iterator<String> it = 	list.iterator();
			
			while (it.hasNext()) {// Now this has become Synchronized
				
				
				System.out.println(it.next());
			}
			
		}
		
		
		// 2 CopyOnWriteArrayList 
		
		//CopyOnWriteArrayList<String> ltr = new CopyOnWriteArrayList<String>();
		
		
		

	}
	

}
