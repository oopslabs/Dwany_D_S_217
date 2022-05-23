package arithmetic_operations;
import java.util.*;
interface operations{
	void sum(int a,int b);
	void mult(int a,int b);
	void div(int a,int b);
	void sub(int a,int b);
		
}
public class arithemtic implements operations {
 
	public void sum(int a,int b)
	 {
		int c=a+b;
		System.out.println("sum is"+c);
	 }
	public void sub(int a,int b )
	{
		int s=a-b;
		System.out.println("difference is "+s);
		}
	public void mult(int a,int b)

{
		int d=a*b;
		System.out.println("product is"+d);
		}
	public void div(int a,int b)
	{
		int q=a/b;
		System.out.println("quotient is"+q);
		
	}
}
