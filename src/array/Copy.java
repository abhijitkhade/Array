package array;
import java.util.Arrays;

public class Copy {

	public static void main(String[] args) {

			int[] numbers = { 10, 2, 5, 1 };


			int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
			
			System.out.println(Arrays.toString(copyOfNumbers));
			
			
		}

		
	}


