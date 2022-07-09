package ALL_PROGRAMS;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		//String word="mom";
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the word to check whether it is palindrome or not= ");
		String word=s.next().toString();
		
		String reverse_word="";
		
		//System.out.println(word.length());
		
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse_word=reverse_word+word.charAt(i);
		}
		System.out.println("Reverse_word is=" +reverse_word);

		System.out.println(word.equalsIgnoreCase(reverse_word));
		
		
		
	}

}
