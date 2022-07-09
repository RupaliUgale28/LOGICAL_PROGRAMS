package SIMPLE_PROGRAM;

import java.util.Scanner;

public class LEAP_YEAR 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter the year = ");
		int a=s.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					System.out.print("= leap year of centuries.");
				}
				else
				{
					System.out.print(" = not leap year of century." );	
				}
				
			}
			else
			{
				System.out.println("= leap year other than centuries." );
			}
		}
		else
		{
			System.out.println(" is not leap year." );

		}
	}

	

}
