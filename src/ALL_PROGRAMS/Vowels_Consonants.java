package ALL_PROGRAMS;

import java.util.Scanner;

public class Vowels_Consonants {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter letter to check whether it is vowel or consnant= ");
		char letter=s.next().charAt(0);
		switch(letter)
		{
		case 'a': System.out.println("vowel");
		break;
		case 'e': System.out.println("vowel");
		break;
		case 'i': System.out.println("vowel");
		break;
		case 'o': System.out.println("vowel");
		break;
		case 'u': System.out.println("vowel");
		break;
		default: System.out.println("consonant");

		}
		
	}
}
//HERE we have to write all small and capital letters cses for vowels ..means total 10 cases for 5 vowels.
//"default"= it is only default ...not case word need to be add.
//