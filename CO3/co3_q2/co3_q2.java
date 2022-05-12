package dwanyjava;
import java.util.*;
public class co3_q2 {
public static void main(String args[])
{
	int no;
	teacher arr[]=new teacher[30];
	
	Scanner o=new Scanner(System.in);
	System.out.println("enter the no of teachers");
	 no=o.nextInt();
	 for(int i=0;i<no;i++)
	 {
		  arr[i]=new teacher();
	 }
	 for(int i=0;i<no;i++)
	 {
		 arr[i].display();
		 
	 }
	
}
}
class emplo
{
	int  empid;
	String name;
	int salary;
	String address;
emplo()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the employeeid");
	empid=ob.nextInt();
	System.out.println("enter the name of th employee");
	name=ob.nextLine();
	System.out.println("enter the salary");
	salary=ob.nextInt();
	System.out.println("enter the address");
	address=ob.nextLine();
	
}	
}
class teacher extends emplo
{
	String department;
	String subjects;
	int i;
	teacher()
	{
		super();
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the department");
		department=obj.nextLine();
		System.out.println("enter the subjects");
		subjects=obj.nextLine();
		
		
		
	}
	void display()
	{
		
		System.out.println(" the employeeid "+empid);
		
		System.out.println("the name of th employee "+name);
	
		System.out.println(" the salary "+salary);

		System.out.println("the address "+address);

		System.out.println(" the department "+department);
		
		System.out.println(" the subjects "+subjects);
		
	}
}
