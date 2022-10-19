package week3day2assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		
		
		TreeSet<Integer> name = new TreeSet<Integer>(); 
		
		for(int i=0;i<data.length;i++) {
			name.add(data[i]);
		}
		
		ArrayList<Integer> secname=new ArrayList<Integer>(name);
		int size=secname.size();
		System.out.println("The Second Largest Number is : " +secname.get(size-2));
	
	}
}
		
		/*Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int s=data.length;
		int seclarg =s-1;
		
		
		System.out.println(Arrays.toString(data[seclarg]));*/
		
		
		
		
			
		
	
	

	

	
		
		
	 
	


