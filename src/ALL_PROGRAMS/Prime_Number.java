package ALL_PROGRAMS;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the any number= ");
		int Enter_number=s.nextInt();
		
		int count=0;
		for(int i=2;i<Enter_number;i++)
		{
			if(Enter_number%i==0)
			{
				count=count+1;
			}
			
		}
		if(count==0)
		{
			System.out.println("o/p= Prime number");	

		}
		else 
		{
			System.out.println("o/p= Not a prime number");	

		}
		
	}
	
}
		
//check why not for loop started for one..but by 2.
//