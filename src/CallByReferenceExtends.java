
public class CallByReferenceExtends {
	
	
	

	public static void main(String[] args) {
		
		CallbyReference call = new CallbyReference();
		
          
            System.out.println(call.x++);
            System.out.println(call.y++);
            
        	CallbyReference call1 = new CallbyReference();
        	
        System.out.println(call1.x++);  
        System.out.println(call1.y++);
	}

}
