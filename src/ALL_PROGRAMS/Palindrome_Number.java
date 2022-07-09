package ALL_PROGRAMS;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) 
	{
		//int number=16461;
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number to check= ");
		int number=s.nextInt();
		int check=number;
		int reverse_number=0;
		int remainder;
		
		while(check!=0)//while(check>0)
		{
		
			remainder=check%10;
			reverse_number=reverse_number*10+remainder;//by this we get reverse number
			check=check/10;
			
		}
		//System.out.println(count);
		
		if(number==reverse_number)
		{
			System.out.println("It is palindrome number");
		}
		else {
			System.out.println("It is not palindrome number");
		}
		
	}

}
