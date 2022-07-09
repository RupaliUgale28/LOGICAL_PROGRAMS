package ALL_PROGRAMS;//swaping in for loop

public class Fibonaccies_Series {

	public static void main(String[] args) 
	{
		//swaping in for loop
		int a=0;
		int b=1;
		int c;
		
		System.out.print("Fibonaccies series= ");
		for(int i=0;i<=10;i++)
		{
			c=a+b;
			System.out.print(c+"|");
			a=b;
			b=c;
		}

	}

}
