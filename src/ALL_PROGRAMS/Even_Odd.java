package ALL_PROGRAMS;

public class Even_Odd 
{
	
	public static void main(String[] args) 
	{
		//Print odd numbers from 100 to 1
		System.out.println("Odd numbers from 100 to 1");

		for(int a=100;a>=1;a--)
		{
			if(a%2==1)
			{
				System.out.print(a+",");
			}
		}
		
		//for even number from 100 to 1
		System.out.println("\n");
		System.out.println("Even numbers from 100 to 1");
		for(int a=100;a>=1;a--)
		{
			if(a%2==0)
			{
				System.out.print(a+",");
			}
		}
		
	}

}
