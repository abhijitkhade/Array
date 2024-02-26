package array;

public class Arraybasic4 {
	public static void main(String[] args) {
		
	
	
	Object[]myarr= {"abhi",'a',10,0.0f,true};
	
	System.out.println("length of arr  :"  + myarr.length);
	
	
	
	for(int i=0;i<myarr.length;i++)
	{
		//if(myarr[i] instanceof String)
		//	if(myarr[i] instanceof Character)
//				if(myarr[i] instanceof Float)
					if(myarr[i] instanceof Integer)
//		{
			
			System.out.println(myarr[i]);
		}
	}
	
	
	
	
	
	}


