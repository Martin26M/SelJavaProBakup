import java.util.Arrays;

public class Array1 {
	
	public void  result (int[] arr) {
		
//		for (int i=0;i<arr.length;i++) {
//			int a=0;
//			int b=0;
//			if( arr[i]==1){
//				
//				a++;
//			}
//			
//			else  if( arr[i]==4){
//				
//				b++;
//			}
//          if(a>b) {
//        	  
//        	  System.out.println(a);
//        	//System.out.println("true");
//          }
//          
//          else {
//        	  System.out.println(b);
//        	 
//          }
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		int[] arr= {1,2,3,7,7};
////		boolean b=true;
////		
////		for (int i=1; i<arr.length;i++) {
////			
////			if((arr[i]==7) &&(arr[i+1]==7) ){
////				
////				
////				System.out.println(b);
////				
////			}
////			
////			else {
////				
////				System.out.println("false");
////			}
////			
////		}
//		
//		if()
//		
//		
//		int[] arr= {1,2,3,1,4,4};
//		
//		Array1 a= new Array1();
//		a.result(arr);
		
		
		     {
		     int a[] = {2,5,6,7,0,1,9};
		        int j=-1,temp;
		        for (int i=0; i<a.length; i++)
		        {
		        if (a[i]%2==0)
		            {
		                j++;
		                temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		         }
		  
		           System.out.println(Arrays.toString(a));
		        }
		}
	}


