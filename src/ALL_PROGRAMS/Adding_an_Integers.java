package ALL_PROGRAMS;

import java.util.Scanner;

public class Adding_an_Integers 
{
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number= ");
		int num1=s.nextInt();
		
		System.out.print("Enter second number= ");
		int num2=s.nextInt();
		
		int add=num1+num2;
		System.out.print("Addition is= "+add);
		

	}

}
