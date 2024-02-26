package array;

import java.util.Arrays;

public class ArrayFill {
	
	public static void main(String[] args) {
		
		int[]num= new int[5];
		
		Arrays.fill(num, 8);
		
		System.out.println(Arrays.toString(num));
		
		
		
		
		int[]num1= {1,2,3};
		
		int[]num2= {4,5,6};
		
		int[]merge= new int[num1.length+num2.length];
		
		System.arraycopy(num1, 0, merge, 0, num1.length);
		
		System.arraycopy(num2, 0, merge, num1.length, num2.length);
		
		System.out.println(Arrays.toString(merge));
		
		
	}

}
