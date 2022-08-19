public class ReverseWordsInStringDemo {

  public static void main(String[] args) {
    System.out.println(modify("new part"));
    

  }
  public static String modify(String s)
  {
    String[] str=s.split(" ");
    String result="";
    for(int i=0;i<str.length;i++)
    {
      result+=reverse(str[i])+" ";
    }
    return result;
  }
  private static String reverse(String string) {
    char[] ch=string.toCharArray();
    int p1=0;int p2=string.length()-1;
    while(p1<p2)
    {
      char c=ch[p1];
      ch[p1]=ch[p2];
      ch[p2]=c;
      p1++;
      p2--;
      
    }
    return String.valueOf(ch);
  }

}