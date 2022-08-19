
public class singleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checksingleton obj1 = checksingleton.getInstance();
		checksingleton obj2 = checksingleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}

}

class checksingleton {

	 static  checksingleton obj = new checksingleton();
	
	private checksingleton() {
		
		
		
	}
	
	public static checksingleton getInstance() {
	
		
		return obj;
	}

}
