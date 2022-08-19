import java.util.Arrays;
import java.util.List;

public class ConvertArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "My name is Martin";
		
		
		char[]  ch  =s.toCharArray();
		
		
		List<char[]> li = Arrays.asList(ch);
		
		
		for (char[]  res: li) {
			
			System.out.println(res);
		char[]  res1 =	li.get(0);
			System.out.println(res1);
			
			li.stream().forEach(s1-> System.out.println(s1));
			
		}
		
		
	}

}
