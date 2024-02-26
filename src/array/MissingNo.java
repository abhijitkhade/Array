package array;

public class MissingNo {
	public static void main(String[] args) {
		int totalnum;
		int []numbers= {3,4,5,7};
		
		totalnum= 7;
		
	int expected_num_sum = totalnum * ((totalnum + 1) / 2);
		   int num_sum = 0;
		   for (int i: numbers) {
		    num_sum += i;
		   }
		       System.out.print( expected_num_sum - num_sum);
			   System.out.print("\n");
	}

}
