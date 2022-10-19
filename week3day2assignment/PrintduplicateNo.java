package week3day2assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintduplicateNo {

	
	public static void main(String[] args) {
		
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> dup=new HashSet<Integer>();
		
		for(int i=0;i<=data.length-1;i++) {
			
			for(int j=i+1;j<=data.length-1;j++) {
				if(data[i]==data[j]){
					dup.add(data[i]);
				}
					//System.out.println("The Duplicate values are " +dup);
					
				
			}
		}
		
		
				
		System.out.println("The Duplicate values are " +dup);
		

	}

}
