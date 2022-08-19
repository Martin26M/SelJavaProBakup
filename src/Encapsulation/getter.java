package Encapsulation;

public class getter {

	//private data variables 
	private static  int a=10;
	private static String Name ;
	private static int age;
	
	
	// adding getter and setter methods >> got to source (right click )>>generate Getter & setter methods
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getter obj  = new getter();
		
		obj.setAge(20);// Using the set  methods to assign the values .
	 
		obj.setName("Martin");// Using the set  methods to assign the values .
		obj.setNumber(50);// Using the set  methods to assign the values .
		
		System.out.println(obj.getAge());// Using the get methods to recieve the values and print.
		System.out.println(obj.getName());// Using the get methods to recieve the values and print.
		System.out.println(obj.getNumber());
		System.out.println(getter.a);
		System.out.println(getter.Name);// Here we are calling the static variables by classname done just as ex
		
		System.out.println(getter.getNumber());// Here we are calling the static method  by classname done just as ex
		
		
	}




	public void setNumber(int number) {
		this.a = number;// Here we are changing the value of private a using encapsulation
	}
	public static int  getNumber() {
		return a;
	}


	public void setName(String name) {
		this.Name = name;
	}

	public String getName() {
		return Name;
	}



	

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
