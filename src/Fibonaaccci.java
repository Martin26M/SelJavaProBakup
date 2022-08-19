
public class Fibonaaccci {
	
	
	
public static void main(String[] args) {
	
	
	int a =0;
	
	int b =1;
	
	int sum ;
	
	for (int i=0 ; i< 10 ; i++) {
		
		
		sum = a+b;
		
		a=b;
		b=sum;
		//System.out.print(sum);
	}
	
	// for prime
	
	
	int a1=10;
	int f=1;
	
	for (int i =1; i<a1; i++) {
		
		
		f+= f*i;
	}
	
	System.out.println(f);
}

}
