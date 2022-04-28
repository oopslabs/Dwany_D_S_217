package dwanyjava;
import java.io.*;
import java.util.*;

public class co2_q4 {
	public static void main(String args[])
	{
	
	employee e1[]=new employee[10];
	System.out.println("enter the number of employee");
	Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
		for(int i=0;i<n;i++)
		{
			e1[i]=new employee();
			e1[i].inputdata();	
		}
		for(int i=0;i<n;i++)
		{
			e1[i].display();
			
		}
		
System.out.println("enter the employee no to be searched");
int en=ob.nextInt();
int flag=0;
			for(int i=0;i<n;i++)
			{
				if(e1[i].eno==en)
				{
				 flag=1;
					System.out.println("employee found");
				}
				}
				if(flag==0)
				{
					System.out.println("employee not found");
				}
			
	
}
}
class employee
{
	int eno;
	String ename;
	float esalary;
	void inputdata()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter your name");
		ename=ob.nextLine();
		System.out.println("enter your no");
             eno=ob.nextInt();
           System.out.println("enter your salary");
           esalary=ob.nextFloat();	
	}
	void display()
	{
		System.out.println("name"+ename);
		System.out.println("employee no"+eno);
		System.out.println("Salary"+esalary);	
	}
}

