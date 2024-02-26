package array;

public class Arrayequals {
	
	public static void main(String[] args) {
		
		
		int[] num1= {10,20,30};
		//int[] num2= {10,50,30};
		int[] num3= {10,20,30};
		
		checkEquality(num1,num3);
		//checkEquality(num1,num3);
		
	}

	private static void checkEquality(int[] num1, int[] num3)
	{
		boolean equalornot=true;
		
		if (num1.length==num3.length)
		{
			for(int i=0;i<num1.length;i++) {
				if (num1[i]!=num3[i])
				{
					equalornot=false;
				}
				
			}
			
		}
		else {
			equalornot=false;
		}
		if(equalornot)
		{
			System.out.println("two array are equal");
		}
			else
			{
				System.out.println("two array are  not equal");
				
				
				
			}
	}
		
	}


