 package ALL_PROGRAMS;

import java.util.Scanner;

public class Reverse_STRING 
{
	public static void main(String[] args) 
	{
		//String name="Rupali Ugale";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter string to reverse= ");
		String string=s.next().toString();
		String reverse_string="";
		
		//System.out.println(string.length());
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse_string=reverse_string+string.charAt(i);
		}
		
		System.out.println("Reverse string is= "+reverse_string);

	}

}
