import java.util.Scanner;

public class Program{
public static void deleteChar(String s, int index) {
if (index < 0 || index > s.length()-1) {
System.out.println("Error!!!!");
}
else
{
char[] ch = new char[s.length() - 1];
for (int i = 0; i < s.length() - 1; i++) {
if (i < index) {
ch[i] = s.charAt(i);
} else {
ch[i] = s.charAt(i + 1);
}
}
String finalstr =new String(ch);


System.out.println("String after removing character : " + finalstr);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String : ");
String s = sc.next();
System.out.println("Enter the index : ");
int i = sc.nextInt();
sc.close();
deleteChar(s, i);
}}