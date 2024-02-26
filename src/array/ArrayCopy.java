package array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40 };
		

	//	int[] copynum = Arrays.copyOf(num, num.length);

	//	System.out.println(Arrays.toString(copynum));


		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	//	System.arraycopy(num, 0, copynum, 0, num.length);

	//	System.out.println(Arrays.toString(copynum));// system.arraycopy method...
		
	//	System.out.println(Arrays.toString(copyGivenArray));// system.arraycopy method...

		System.out.println("...... by method");
		int[] copyNumbers = copyGivenArray(num); // method call
		
		System.out.println(Arrays.toString(copyNumbers));

		//System.out.println(num == copynum);
	}

	private static int[] copyGivenArray(int[] input) {
		int[] inputCopy = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			inputCopy[i] = input[i];
		}
		return inputCopy;

	}
	
}
