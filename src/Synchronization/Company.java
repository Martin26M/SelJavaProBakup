package Synchronization;

public class Company {
	
	int n ;
	
	boolean f = false;
	synchronized public void producer(int n) throws InterruptedException {
		
		 {
			 if (f) {
				 
				 wait();
			 }
			 
			 
			 this.n=n;
			System.out.println("Produced by producer"+ this.n);
			f= true;
			notify();
			
		}
	}
		
	
	synchronized public int consumer() throws InterruptedException {
		 {
			 if (!f) {
				 
				 wait();
			 }
			 
			 
			System.out.println("Consumbed  by consumer"+ this.n);
			f=false;
			notify();
			return this.n;
			
		}
	}
	
	
	

}
