import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] str = {"abc","cde","efg"};
String news = Arrays.toString(str);
		System.out.println(news);

		for (String s : str) {
			
			
			StringBuffer nstr = new StringBuffer();
			
			nstr = nstr.append(s);
		
			System.out.print(nstr);
		}
		
	}

}
