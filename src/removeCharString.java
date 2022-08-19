
public class removeCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  ="123martin@#$!@#$";
		
		String check =str.replaceAll("[^0-9]", "");
		
		System.out.println(check);
		
	}

}
