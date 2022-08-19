package Encapsulation;

public class setter {

	
	private int a=100;
	private int b=200;
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setter set = new setter ();
		System.out.println(set.getA());
		set.setA(500);
		System.out.println(set.getA());
		
	}

}
