package week2.day2assign;

public class Fibonacci {

	public static void main(String[] args) {
		//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		    int range=8;
	        int firstnum =0;
	        int secondnum=1;
	     // Print first number
	     System.out.print(firstnum+ ",");
	     System.out.print(secondnum);
	  // Iterate from 1 to the range
	        for(int i=1;i<range-1;i++)
	        {
	 // add first and second number assign to sum
	int sum=firstnum+secondnum;
	// Assign second number to the first number
	firstnum=secondnum;
	// Assign sum to the second number
	secondnum=sum;
	// print sum
	System.out.print(","+sum );
}
}
}
		
