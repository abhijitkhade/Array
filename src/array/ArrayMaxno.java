package array;

import java.util.Arrays;

public class ArrayMaxno {
	
	
	public static void main(String[] args) {
		
		int[]arr= {10,5,20,80};
		
		 Arrays.sort(arr);
		 int[]sorted= new int[arr.length] ;
		 int[]max = new int [sorted.length-1];
		 System.out.println(Arrays.toString(max));
		// System.out.println(sorted);
		
		//System.out.println(Arrays.toString(arr.length-1));
		
		
		
		
		
		//int max=arr[0];                //initalize first element of Array
		int min=arr[0];                //initalize first element of Array
		
		for(int i=0;i<arr.length;i++) {
			
			//if(arr[i]>max)
			
			if(arr[i]<min)
				
				//max= arr[i];
				
			min= arr[i];
		}
		
	//	System.out.println("large no of array"+max);
		
		
	//	System.out.println(" small no of array " + min);
		
	}

}
