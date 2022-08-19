package MultiTasking;

public class Classtest1 extends Thread {
	
	public void run() {
		
		
		for (int i =0; i<10; i++) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Classtest1 cc = new Classtest1();
		cc.start();
		
	
		
		  Thread tt =	Thread.currentThread();
			 System.out.println(tt.getName());
		 System.out.println(tt.getName());
		 
			try {
				Thread.sleep(1000);
			}
			catch (Exception e ) {
				e.printStackTrace();
				
			}

		 
	}

}
