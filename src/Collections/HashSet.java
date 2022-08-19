package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSet {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<String ,String> map = new HashMap<String ,String>();
	    
	    map.put("Martin", "3");
	   map.put("Hello", "Check");
	   map.put("1", "2");
	   String syso = map.get("Martin");
	  
	 Iterator<String> itr=   map.keySet().iterator();
	
	   
	
	 while (itr.hasNext()) {
		 
		String out = itr.next();
		System.out.println(out);
		System.out.println(map.get(out));
	 }
	}

}
