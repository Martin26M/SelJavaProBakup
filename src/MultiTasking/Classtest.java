package MultiTasking;

public class Classtest extends Thread{

	public void run() {
		
		for (int i =0; i<10; i++) {
			
			System.out.println("Printing Thres number"+i);
		}
		
	}
	
	public void show () {
		
		System.out.println("content is displayed");
	}
	
	public static void main(String[] args) {
		Classtest obj = new Classtest();
		
		obj.start();
	
		
		
		Thread t = Thread.currentThread();
		System.out.println("Current thread name is"+ " "+ t.getName());
	
		
		
		try {
			Thread.sleep(1000);
		}
		catch (Exception e ) {
			e.printStackTrace();
			
		}

		}
}
