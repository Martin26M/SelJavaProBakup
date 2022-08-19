package Encapsulation;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Encapsulation obj = new Encapsulation();
		//int k=obj.passwd=100;// We can access this instance variable as it is not private and can change its value.
		
		//obj.Statement(123456, 4877, 100);
		obj.updatepin(123456, 4877, 1233);
		obj.Statement(123456, 100, 500);
	}

}
