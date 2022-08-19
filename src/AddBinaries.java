import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddBinaries {

  public static void main(String[] args) {
	  
	  
    System.out.println(addBinary(111110,1011110));
    

  }
  public static int addBinary(Integer i1,Integer i2)
  {
  
    return count(i2,i1);
    
  }
  
  
  public static int count(Integer i, Integer i1)
  {
    String s=String.valueOf(i);
    
    int l=s.length();
    s=s.replaceAll("1","");

    return l-s.length();
  }
  
 

}
