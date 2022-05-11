package dwanyjava;
import java.util.*;
public class co3_q1 
	{ 

	public static void main(String args[])
	{
			Scanner obj=new Scanner(System.in);
			System.out.println("enter the side of square");
			int s=obj.nextInt();
			System.out.println("enter the length ");
			int l=obj.nextInt();
			System.out.println("enter the  breadth");
			int b=obj.nextInt();
			System.out.println("enter the radius");
			int r=obj.nextInt();
			
			shape ob=new shape();
			int ar=ob.area(s);
			System.out.println(" area of square is "+ ar);
			int ar2=ob.area(l,b);
			System.out.println("area of rectangle is"+ar2);
			double ar3=ob.area(r,0,0);
			System.out.println("area of circle is "+ar3);
			
	}
	}
  class shape
  {
	  int area(int a)
	  {
		  return a*a;
	  }
	  int area(int l,int b)
	  {
		  return l*b;
	  }
	  double area(int r,int h,int s)
	  {
		return 3.14*r*r; 
	  }
  }

