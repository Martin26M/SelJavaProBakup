import java.util.Scanner;

public class oPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with dog and cat");
		String s = sc.next();
		String a = "cat";
		String b = "dog";
		int aa = (s.length() - s.replace(a, "").length()) / a.length();
		int bb = (s.length() - s.replace(b, "").length()) / b.length();
		if (aa == bb) {
		System.out.println("true");
		} else {
		System.out.println("false");
		}
		}
		}
	}

}
