package OOPS;

public class ChildClass extends ParentClass {

	
	

	public   void item() {
		
		System.out.println("under child");
		
	}
	
public void item1() {
		
		System.out.println("under child again");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		c.item();
		
		ParentClass p = new ChildClass();
		p.item();// overrriden method under child
		p.itemunderParent();
		
		ChildClass cc = (ChildClass)p;
		cc.item();
		cc.item1();// After downcasting  with cc we can access methods of child class  and parent class and overriden method as well
		cc.itemunderParent();
		
	}

}
