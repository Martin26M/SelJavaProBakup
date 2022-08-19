
public class maximumOddtoright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int p[] = { 0, 5, 0, 3 };
		    int index = -1, oddHigh = 0;
		    
		      for (int j = 0; j < p.length; j++) {
		        if (p[j] == 0 && index == -1) {
		          index = j;
		        }
		        if (index >= 0 && p[j] % 2 != 0) {
		          if (oddHigh < p[j]) {
		            oddHigh = p[j];
		          }

		        }
		      
		      if (oddHigh != 0) {
		        p[index] = oddHigh;
		      }
		      oddHigh = 0;
		      index = -1;
		      }
		    for (int i = 0; i < p.length; i++)
		      System.out.println(p[i]);
		    }


	}


