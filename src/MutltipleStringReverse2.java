
public class MutltipleStringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MutltipleStringReverse2.modify("Martin Mathew"));

	}
	
	
	public static String    modify(String str ) {
		
		String result="";
		String[] str1 = str.split(" ");
		
		
		for (int i=str1.length-1; i>=0; i--) {
			
			result+= string(str1[i]+" ");
			
			
		}
		
		return result;
	}
	
	public static String string(String string) {
		
		
		String str="";
		String[] split2= string.split("");
		for (int i=string.length()-1; i>=0;i--) {
			
			
			str= str+split2[i];
			
		}
		
	
		return str;
		
		
		
		
		
	}

}
