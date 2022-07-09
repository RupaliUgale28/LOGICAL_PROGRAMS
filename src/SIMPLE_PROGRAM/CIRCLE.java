package SIMPLE_PROGRAM;

public class CIRCLE 
{
	public void m1()//area of circle by using diameter
	{
		//Area of circle by using diameter
		double d=20;
		double pi=3.14;
		double area;
		area=(pi*d*d)/4;//FORMULA
		System.out.println("2)Area of circle is using diameter = " +area);
	}

	public static void main(String[] args) 
	{
		//Area of circle by using radius
		double r=10;
		double pi=3.14;
		double area;
		area=pi*r*r;//FORMULA
		System.out.println("1)Area of circle is using radius = " +area);
		
		CIRCLE a=new CIRCLE();
		a.m1(); 
	}


}
