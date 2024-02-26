package array;

public class Duplicate {
	public static void main(String[] args) {
		
	int[]num= {10,320,30,40,40,10};
	
	for(int i=0;i<num.length-1;i++)
	{
		
		for(int j=i+1;i<num.length;i++)
			
	{ 
			if ((num[i] == num[j])  && (i != j))
    {
        System.out.println("Duplicate Element : "+num[j]);
    }

}
}
	}
}