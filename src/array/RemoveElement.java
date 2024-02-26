package array;

import java.util.Arrays;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		int []number= {10,20,30,40,50,60};
		
		int index=1;
		for(int i=index;i<number.length-1;i++) {
			number[i]= number[i+1];
		}
	      System.out.println(Arrays.toString(number));	
	}

}
