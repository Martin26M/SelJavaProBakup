package Synchronization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cc = new Company();
		
		Consumer c = new Consumer(cc);
		Producer pp = new Producer(cc);
		pp.start();
		c.start();
		

	}

}
