package array;

public class ArrayDuplicate {
	public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1};
	        
	        int[] num= {8,2,5,6,7};

	        // Find and print duplicate elements
	        System.out.println("Duplicate elements in the array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    System.out.println(array[j]);
	                }
	            }
}
	}
}