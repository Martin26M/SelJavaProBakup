
public class TwoDarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		                          
		String[][] array  = new String[][]{ {"Martin","First"}, {"Ann","Second"}, {"Mathew","Third"},{"HI"}};
		
		
		//String[][] salutation = { {"Mr. ", "Mrs. ", "Ms. "}, {"Kumar"} }; // Mr. Kumar System.out.println(salutation[0][0] + salutation[1][0]); // Mrs. Kumar System.out.println(salutation[0][1] + salutation[1][0]); } }

		 // System.out.println(hello[0][0] + hello[3][1] );
		
		  for (int i =0; i<array.length; i++) {// Here is an array with 4 index as 0,1,2,3 , where 0 has 2 elemetns, 1 has 2 elements, 2 has 2 elements , 3 has 1 element
			  
			  for (int j=0; j<array[i].length;j++)
			  {
				  
				 System.out.print(array[i][j]+ " ");
				  
			  }
			  System.out.println();
			  
			  /*
			   * 
			   * 
			   * Sameple  for 2d matrix 
			   * public class ForLoopExample {
    public static void main(String[] args) {
        int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
         
        System.out.println("Elements are :");
        for(int i=0; i< values.length; i++) {
            for(int j=0; j< values[i].length; j++) {
                System.out.print(values[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
			   * 
			   * 
			   * 
			   */
		  }
	}

}
