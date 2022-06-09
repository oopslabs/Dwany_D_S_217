package dwanyjava;
import java.util.*;

class authenticate extends Exception
{
	authenticate(String mg)
	{
		super(mg);
	}
}
public class co4_q3 {

public static void main(String args[])
{
	String name,password;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	name=sc.nextLine();
	System.out.println("enter the password");
	password=sc.nextLine();
	 try
	 {
		 if(name.matches("dwany") && password.matches("1234"))
		 {
			 System.out.println("Successfully login ");
			 
		 }
		 else
		 {
			 throw new authenticate("invalid name or password");
			 
		 }
		 
	 }catch(authenticate ex)
	 {
		 System.out.println(ex.getMessage());
	 }
}
}