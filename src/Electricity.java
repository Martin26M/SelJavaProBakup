import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the electric consumption");
		int ec= sc.nextInt();
		
		if(ec>1 && ec<100) {
			
			int res1= ec*10;
			System.out.println(res1);
		}
		
		else if (ec>100 && ec<200) {
			
			int res2= ec*15;
			System.out.println(res2);
		}
		
	else if (ec>200 && ec<300) {
			
			int res3= ec*20;
			System.out.println(res3);
		}
		
	else if (ec>300) {
		
		int res4= ec*25;
		System.out.println(res4);
	}
		
	else {
		
		System.out.println("sai num daal bhhosad");
	}
	}
	}

