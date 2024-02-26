package array;

public class Avrage {
	
	public static void main(String[] args) {
		int []num= {10,20,30,40};
		
		int sum=0;
		
	//	for(int i=0;i<=num.length-1;i++)
		
			for(int i=0;i<num.length;i++)
		
		sum= sum+num[i];
		
		double Avg= sum/num.length;
		
		System.out.println("avrage of num[]"+Avg);
	}

}
