package com.jtraining.assign10;


import java.util.Arrays;

public class ArrayProduct {
	public static void main(String[] args) {    
		 int ar[] = {1,2,3,4,5};
		 int[] result = new int[5];

		 for (int i = 0; i < ar.length; i++) {
			int product = 1;
			for (int j = 0; j < ar.length; j++) {
				if (i != j)
					product = product * ar[j];
			}
			result[i] = product;
		}
		 
		System.out.print("Given array is ");
		System.out.println(Arrays.toString(ar));
		System.out.println("product of the array: " + Arrays.toString(result));
		
		
	}

}