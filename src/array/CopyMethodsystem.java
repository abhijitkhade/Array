package array;

import java.util.Arrays;

public class CopyMethodsystem {
	
	public static void main(String[] args) {
		
		int []number= {10,20,30,40};
		
	//int[]copynumber=number;
		
		int []copynumber=new int[number.length];
		
		System.arraycopy(number, 1, copynumber, 0, number.length-1);
		
		Arrays.copyOfRange(number, 1, 2);
		
		int[]num1=(Arrays.copyOfRange(number, 1, 4));
		
		System.out.println(Arrays.toString(num1));
		
    //   int[] copyNumbers = copyGivenArray(number);
		
	System.out.println(Arrays.toString(copynumber));
//		
//		System.out.println(number == copyNumbers);
//				
	   // Arrays.copyOf(number, number.length);
	    
	    
	   // System.out.println(Arrays.toString(number));
	}

//	private static int[] copyGivenArray(int[] number) {
//		
//	int[] inputCopy = new int[number.length];
//		
//		for(int i=0; i<number.length; i++)
//		{
//			inputCopy[i] = number[i];
//		}
//		
//		return inputCopy;
//	}
		
		
		
		
		
		
	}
	
	
	
	


