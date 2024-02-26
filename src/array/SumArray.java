package array;

public class SumArray {
	public static void main(String[] args) {
	
		int[]num= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int n:num)
		{
		//	sum+=n;
			sum=sum+n;
		}
		System.out.println(sum);
	}

}
