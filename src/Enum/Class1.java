package Enum;

enum checking{
	
	check1, check2, check3;
}


public class Class1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checking cc = checking.check2;
		switch (cc) {
		
		case check1 :
			System.out.println("under check1");
		case check2 :
			System.out.println("under check2");
		
		}

	}

}
