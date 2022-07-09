package ALL_PROGRAMS;

public class Star_Pattern 
{
	public static void main(String[] args) 
	{
		//program of left to right stars
		System.out.println("OUTPUT OF FIRST FOR LOOP");
		for(int a=5;a>=1;a--)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(" ");
			}
			
			System.out.println("*");			
		}
		
		System.out.println("OUTPUT OF SECOND FOR LOOP");
		//for right to left stars
		for(int a=4;a>=0;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
		System.out.println("*");				
		}	
	}

}
