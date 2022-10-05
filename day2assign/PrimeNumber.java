package week2.day2assign;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int no=12;
		boolean flag=false;
		for(int i=2;i<=no/2;i++)
	 {
			  if(no%i==0) 
			  { 
				  flag=true;
				  break;
			  }	  }
	 
			   
			if(flag) 
			   {
				  System.out.println("The Given Number is non Prime"); 
			   }  else {
				  System.out.println("The given number is  prime");
			   } 
			  
		}
			}


