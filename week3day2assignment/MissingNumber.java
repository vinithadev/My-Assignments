package week3day2assignment;

import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
	
		int[] no= {2,4,1,3,6,7,9,5,8,4,8,2,9};
		
		TreeSet<Integer> num=new TreeSet<Integer>();
		for(int i=0;i<no.length;i++) {
			num.add(no[i]);
		}
			System.out.println(" The number is an Ascending Order " +num);
			
		for(int i=1;i<no.length;i++) 
		{
			if(!num.contains(i)) 
			{
		System.out.println("The Missing Number is : " +i);
		
			
		
		}
			
		
		}
		
	}

}
