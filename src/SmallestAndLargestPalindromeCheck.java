import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SmallestAndLargestPalindromeCheck { 
	
public static String reverse(String value)

{
 String reverse=""; 
for(int i=value.length()-1;i>=0;i--) { 
reverse=reverse+value.charAt(i); 
}

return reverse;
 } 
public static void main(String[] args)


{ 
String[] arr= {"abc","adda","abddab","abbbba"}; 
int j=0; 
String[] arr1=new String[arr.length];
 List<String> checkPalindrome=new ArrayList<String>();
 for(int i=0;i<arr.length;i++) { 
if(reverse(arr[i]).equals(arr[i])) {
 arr1[j++]=arr[i]; 
} 
}
 
 
 for(int i=0;i<arr1.length;i++) {
 if(arr1[i]!=null) { 
	 
checkPalindrome.add(arr1[i]);
} 
 
} 
 
 Collections.sort(checkPalindrome);

 String large="",small=""; large=small=checkPalindrome.get(0); 
for(int i=1;i<checkPalindrome.size();i++) 
{ 
if(small.length()>checkPalindrome.get(i).length()) {
small=checkPalindrome.get(i);
 } if(large.length()<checkPalindrome.get(i).length()) { 
large=checkPalindrome.get(i); 
} 
} 
System.out.println("smallest palindrome from the given is "+small); System.out.println("largest palindrome from the given is "+large);
 }
 }
