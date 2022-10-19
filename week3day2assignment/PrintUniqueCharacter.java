package week3day2assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name="babu";
		
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
				
	    HashSet<Character> c=new HashSet<Character>();
		for(int i=0;i<a.length;i++) {
			c.add(a[i]);
			
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				
					c.remove(a[i]);
					System.out.println("The Unique Characters are " +c);
				}
			}
		}
			
	
}

}
