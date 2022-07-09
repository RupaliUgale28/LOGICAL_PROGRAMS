package ALL_PROGRAMS;

public class Pyramid1 
{
	public static void main(String[] args) 
	{
		for(int c=5;c>=1;c--)
		{
			for(int d=1;d<=c;d++)
			{
				System.out.print(" ");
				
			}
			System.out.print("*");

			for(int a=5;a>c;a--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
