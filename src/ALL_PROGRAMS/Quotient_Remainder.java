package ALL_PROGRAMS;

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		
		//int divisor=10;
		//int dividend=200;
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter dividend= ");
		int dividend=s.nextInt();
		
		System.out.print("Enter divisor= ");
		int divisor=s.nextInt();
		
		
		int Quotient=dividend/divisor;
		int Remainder=dividend%divisor;
		
		System.out.println("Quotient is= " +Quotient);
		System.out.println("Remainder is= " +Remainder);

	}

}
