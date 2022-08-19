
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="marton";
		char  temp = ' ';
		
	/*	for (int i =str.length()-1 ; i>=0; i--) {
			
			
			temp+= str.charAt(i);
			
		}
		
		System.out.println(temp);

	}
*/
	char[]  ch =	str.toCharArray();
		
		int start =0;
		int end = str.length()-1;
		
		while (start<end) {
			
			temp= ch[start];
			ch[start]= ch[end];
			ch[end]=temp;
			
			start++;
			end--;
			
			
			
		}
		
		for (Character res: ch) {
			System.out.print(res);
			
		}
}
}