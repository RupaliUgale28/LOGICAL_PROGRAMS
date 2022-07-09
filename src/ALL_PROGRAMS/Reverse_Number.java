package ALL_PROGRAMS;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		
		//int number=123123;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number to reverse= ");
		int number=s.nextInt();
		
		int reverse_number=0;
		int remainder=0;
		
		while(number>0)
		{
			remainder=number%10;//get size of it
			reverse_number=reverse_number*10+remainder;
			number=number/10;
			
		}
		
		System.out.println("Reverse_number is=" +reverse_number);
		
	}

}
		//for(int i=10;i>=0;i--)
		//{
		//	System.out.print(i+"->");
		//}