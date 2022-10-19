package week3day2assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String name="PayPal India";
		String lowerCase = name.toLowerCase();
		char[] charr=lowerCase.toCharArray();
		
		//System.out.println(Arrays.toString(charr));
		int i=0;
		Set<Character> charset=new HashSet<Character>();
		Set<Character> dupcharset=new HashSet<Character>();
		for( i=0;i<charr.length;i++) {
			 //charset.add(charr[i]);
		
			// System.out.println(charset);
			if(!charset.add(charr[i])) {
				dupcharset.add(charr[i]);
			}}
			System.out.println(dupcharset);
			
			charset.removeAll(dupcharset);
			System.out.println(charset);
		List<Character> List=new ArrayList<Character>(charset);
		for(i=0;i<List.size();i++) {
			System.out.print(List.get(i));
		}
		
	}
}

