package ALL_PROGRAMS;

import java.util.Scanner;

public class Leap_Year {

public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the any year= ");
		int year=s.nextInt();
		
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap year of century");
				}
				else {
					System.out.println("Leap year other than century");
				}
			}
			else {
				System.out.println("Leap year of decade");
			}
			
		}
		else {
			System.out.println("Not a leap year");
		}
	}
}

	//if()
	//{
	//	System.out.println("leap year");
	//}
	//else {
	//	System.out.println("not a leap year");
	//}
	//}
	
		