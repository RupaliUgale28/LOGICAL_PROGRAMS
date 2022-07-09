package ALL_PROGRAMS;

import java.util.Scanner;

public class Vowel_Consonant_by_if_else {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any letter= ");
		char letter=s.next().charAt(0);
	
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}
		
	}

}
