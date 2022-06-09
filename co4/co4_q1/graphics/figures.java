package graphics;
import java.util.*;
import java.io.*;
interface shapes
{
	void rectangle(float a,float b);
	void square(float a);
	void triangle(float a,float b);
	void circle( float a);
	
}

public class figures implements shapes {
	

	public void rectangle(float a,float b)
	{
		System.out.println("area of rectangle is "+a*b);
	}
	public void square(float a)
	{
		System.out.println("are of square is"+a*a);
		
	}
	public void triangle(float a,float b)
	{
		System.out.println("area of triangle"+0.5*a*b);
	}
	public void circle(float a)
	{
		System.out.println("area of circle is"+2*3.14*a);
	}

}
