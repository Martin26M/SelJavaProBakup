import java.util.Scanner;

public class BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		java.math.BigInteger ba = sc.nextBigInteger();
		
		java.math.BigInteger bb = sc.nextBigInteger();
		
		java.math.BigInteger res1 =	ba.add(bb);
		java.math.BigInteger res2= ba.multiply(bb);
		System.out.println(res1);
		System.out.println(res2);
		
	}

}
