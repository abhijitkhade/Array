package array;

import java.util.Arrays;

public class Concat2Array {
	public static void main(String[] args) {

	int []num1= {1,2,3,4,5,6,7,8,};
	
	int[]num2= {9,10,11,12,13,14,15,16};
	
//	int array1= num1.length;
//	int array2= num2.length;
	
	
	//System.arraycopy(num1, 0, number,0, array1 );
	//System.arraycopy(num2, 0, number,array1, array2);
	
	
	
	int[]number= new int[num1.length+num2.length];
	
	System.arraycopy(num1, 0, number,0, num1.length );
	
	
	System.arraycopy(num2, 0, number,num1.length, num2.length);
	
	System.out.println(Arrays.toString(number));
	

	
	}

	
}
