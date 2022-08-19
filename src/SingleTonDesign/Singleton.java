package SingleTonDesign;

public class Singleton {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		abc obj1 =  abc.getInstance();// We can call only this way the instance of the class abc 
		abc obj2 = abc.getInstance();// now here both obj & obj1 will point to same object
	
	}
}

	class abc {
		
		// Steps to follow to make the class singleton
		
		static abc obj = new abc();// create instance (obj )of abc which is static 
		
		private abc() {// creating a constructor of abc which is private 
			
			
		}
		
		public static   abc getInstance() {// creating the method which returns instance of abc ie obj in this case
			
			return obj;
			
			
		}
	}


