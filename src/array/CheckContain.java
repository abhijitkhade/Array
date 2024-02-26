package array;

public class CheckContain {
	
	public static  boolean contains(int num[],int item) {
		
		for(int n:num) {
			if (item==n) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
	 public static void main(String[] args) {
         int[] my_array1 = {
           1789, 2035, 1899, 1456, 2013, 
           1458, 2458, 1254, 1472, 2365, 
           1456, 2265, 1457, 2456};
     System.out.println(contains(my_array1, 2013));
     System.out.println(contains(my_array1, 2015));

}
}