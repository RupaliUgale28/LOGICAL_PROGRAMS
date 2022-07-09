package SIMPLE_PROGRAM;

import java.util.Scanner;

public class TRIANGLE 
{
	public static void main(String[] args) 
	{
	//	int b=15;
	//	int h=10;
	//	int area;
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the heigth of triangle= ");
		int heigth=s.nextInt();
		
		System.out.print("Enter the breadth of triangle= ");
		int breadth=s.nextInt();
	
		int area=(breadth*heigth)/2;
		System.out.print ("Area of triangle is = "+area);
	}
	

}
