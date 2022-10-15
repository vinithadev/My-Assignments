package week3Day1Assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1;i>=00;i--)
		{
			rev=rev+s.charAt(i);
		}
			System.out.println(rev);
			if(s.equals(rev)) {
				
				System.out.println("the word is palindrome");
			}
			else {
				System.out.println(" the word not palindrome");
			}
	}

}
