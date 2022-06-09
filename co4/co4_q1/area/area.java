package area;
import java.util.*;
import graphics.*;
public class area {
public static void main(String args[])
{
int a,b,s,r;
Scanner ob =new Scanner(System.in);
System.out.println("enter the length and breadth of rectangle");
a=ob.nextInt();
b=ob.nextInt();
System.out.println("enter the side of square");
s=ob.nextInt();
System.out.println("enter the length breadth and height of triangle");
a=ob.nextInt();
b=ob.nextInt();
System.out.println("enter the radius of circle");
r=ob.nextInt();

	figures j  =new figures();
	j.rectangle(a,b);
	j.circle(r);
	j.triangle(a, b);
	j.square(a);
	
	
	
	
	
}
}
