package Synchronization;

public class Consumer extends Thread {
	
	Company c;
	Consumer(Company c){
		
		
		this.c=c;
	}
	public void run() {
		
		while (true) {
			
			try {
				this.c.consumer();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

		
	}

}
