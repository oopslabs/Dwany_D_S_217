package study;
import java.util.*;

public class co4_q11{
	public static void main(String args[])
	{
		LinkedList<String> li= new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the string");
		String str;
		for(int i=0;i<limit;i++)
		{
				str=sc.nextLine();
			li.add(str);
		
		}
		System.out.println("the element are "+li);
		System.out.println("the linked list after deleting all elements");
		li.clear();
		System.out.println("after clearing"+li);
		
		
		
	
		
		
		
	}
}