
public class Armstrong {
	
	public void   finddigit(int num) {
	

		int t=num;
		int i=0;
		int cube=0;
		
		while(num>0) 
		{
		 int j= num%10;
		//i =i*10+j;
		num= num/10;
		
			cube = cube+(j*j*j);
		}

		if (t==cube) {
			
			System.out.println("yes");
		}
		
		else {
			
			System.out.println("no");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Armstrong a = new Armstrong();
			
			a.finddigit(153);
		}
		
	
		
	
}
