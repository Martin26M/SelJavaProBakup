package AccesModifierspack2;

import AccesModifiers.Class1;

public class Class3 extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Class1 obj = new Class1();//Here class 1 is imported from Access Modifier PAckage as  this was in other packg and was public.
		
		Class2 obj1 = new Class2();//Here class 2 is not imported from Access Modifier PAckage as  this was in other packg and was a default class.
		
		
		obj.add();//This csn be accessed as this is public method in Class 1 which is also Public.
		
		//obj.addnew(); //Cannot be accessed as addnew is protected so outside the packg it can be accessed only with inheritance. by creating obj of Class3 only
		
		
		//********************NOw we will add inheritance and check.
		
		Class3 obj2 = new Class3();//Created object of Class 3 to access protected method of class1 using inheritance.
		
		obj2.addnew();//Here we accessed protected method of class1 using inheritance.
		obj2.add();//Here we accessed public  method of class1 without using inheritance.
		
		//obj.addnew1(); cannot be accessed as its a private and can be accessed only in same class.
	}

}
