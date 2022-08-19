package Sttatic;

public class Staticinstancevariables {

	
	
	String name;//Instance variables - Variables whose values changes as per the object of the class
	String address;
	String city;
	static  String aadhar="BXP1702M";//Created static variable which can be called from anywhere by anybody in this ex it can be called by obj1 & obj2 both
	
	Staticinstancevariables(String name,String address,String city,String aadhar)//>>>>>>>>>>> This is a constructor
	{
	
		
		this.name= name;// Global variable name is assiagned a value here using the keyword this
		this.address= address;// Global variable address is assiagned a value here using the keyword this
		this.city= city;// Global variable city  is assiagned a value here using the keyword this
		this.aadhar= aadhar;
	}
         
	
	
	
	
	 public void GetAdress() {
	 
		
		
		System.out.println(address+" "+name+" "+city+" "+aadhar);
	}
	
	
	
	public void  PublicData(String name,String address,String city,String aadhar)
	{
		
		//String NewName = name+address+city;
		
		//return NewName;
		//this.name=name;
		//this.address= address;
		//this.city= city;
		System.out.println(address+" "+name+" "+city+" "+aadhar);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticinstancevariables obj = new Staticinstancevariables("Printed","By"," obj","aadharold");
	
		Staticinstancevariables obj1 = new Staticinstancevariables("Printed","By","Obj1","aadharnew");
		
	
		//obj.GetAdress();// Printed through by creating the constructor for obj i.e "Printed","By","Condtructor with obj"
		//obj1.GetAdress();// Printed through by creating the constructor for obj1 i.e ""Printed","By","Condtructor with obj1"
	
		obj.PublicData("Printed", "By", "Method","aadharnew");// Printed through by creating the method of obj1 instance variable changes value as per the object.
		
	    obj1.PublicData("Printed", "By", "METHOD with different object obj1","aadharnew");
		
		System.out.println(obj.name);
		System.out.println(obj.address);
		System.out.println(obj.city);
		System.out.println(Staticinstancevariables.aadhar);
		System.out.println(obj.aadhar);
	}

}
