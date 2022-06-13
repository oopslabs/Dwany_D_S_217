package CO5;
import java.util.*;

class student{
	
	String name;
	int m1;
	int m2;
	int m3;
	int roll;
	
	student(String a,int b, int c,int d,int e){
	
		name=a;
		m1=b;
		m2=c;
		m3=d;
		roll=e;
		
		
}
}
public class stud {
public static void main(String args[])
{ 
	int n,i=0;
	student o[]=new student[10];
	Scanner ob= new Scanner(System.in);
	System.out.println("enter the no of details");
	n=ob.nextInt();
	while(i>n)
	{
		System .out.println("Enter student name");ob.nextLine();
		String name=ob.nextLine();
		System .out.println("Enter the mark of maths");
		int m1=ob.nextInt();
		System .out.println("Enter the mark of cs");
		int m2=ob.nextInt();
		System .out.println("Enter the mark of hindi");
		int m3=ob.nextInt();
		System .out.println("Enter the rollno");
		int roll=ob.nextInt();
		i++;
	
	}
	void display()
	{
		
	while(i>n)
	{
		System.out.println(" student"+i+" name"+name+"\nmark of maths"+m1+"mark of cs"+m2+"mark of hindi"+m3+"roll number"+roll);
	}
		
}
}
	


