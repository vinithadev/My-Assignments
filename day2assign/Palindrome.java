package week2.day2assign;

public class Palindrome {

	public static void main(String[] args) {
		int no=34343;
		String s = Integer. toString(no);
		int temp=no;
		int sum=0;
		for(int i=s.length();i>0;i--)
		{
			sum=(sum*10)+(no%10);
			no=no/10;
		}
		if(temp==sum) {
			System.out.println(temp+ "is a palindrome number");
		}
		else
		{
				System.out.println(temp+ "is not a palindrome");
		}
	}

}
