package array;

import java.util.Arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int[]number1= {10,20,30,40,50,60,60,70,80};
		
		int []copynumber1= new int[9];
		
		System.out.println(Arrays.toString(copynumber1));
		
		for (int i=0;i<number1.length;i++) 
		{
			copynumber1[i]=number1[i];
		}
		
		System.out.println(Arrays.toString(copynumber1));
		
		
		int[] num3=Arrays.copyOf(number1, 9);
		System.out.println(Arrays.toString(num3));
		
		
		
		
	}
   
}
