import java.util.Scanner;

public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner sc,sc1;
		sc=new Scanner(System.in);
		String str1=sc.next();

		System.out.println("enter");
		sc1=new Scanner(System.in);
		String str2=sc1.next();
		
		
		String s1,s2,s3;
		s1=str1.substring(1);
		s2=str2.substring(1);
		System.out.println(s1);

		System.out.println(s2);


		s3=(new StringBuilder()).append(s1).append(s2).toString();

		System.out.println(s3);



		}

	}

