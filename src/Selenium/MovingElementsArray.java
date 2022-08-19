package Selenium;

import java.util.Arrays;

public class MovingElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,3,4,0,5,3,0,9};
		
		Arrays.sort(arr);

		 int counter=0;
			//int last=	arr[arr.length];
		for (int i=0 ; i<=arr.length-1; i++) {
			
		
			if (arr[i]==0) {
				
				counter++;}
				
				while(counter>=0) {
					arr[i]= arr[arr.length]-counter;
					
				
					counter--;
				
				}
			}
		
	
		
		for (int o : arr) {
			
			System.out.println(o);
		
	}

}}
