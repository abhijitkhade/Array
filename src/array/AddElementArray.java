package array;

import java.util.Arrays;

public class AddElementArray {
	
	public static void main(String[] args) {
	int []number1= {10,25,30,85,40};
	
	int index=4;
	int add=100;
	
	for(int i=number1.length-1;i>index;i--)
	
	number1[i]=number1[i-1];
	
	number1[index]= add;
	
	System.out.println(Arrays.toString(number1));
	
	}
	

}
