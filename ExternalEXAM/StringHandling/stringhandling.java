package javaa;
import java.util.*;
public class stringhandling {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the String");
		String str=sc.nextLine();
		System.out.println("the length of the String is "+str.length());
		System.out.println("the string is uppercase :"+str.toUpperCase());
	    System.out.println("the String in Lowercase :"+str.toLowerCase());
	    System.out.println("to find charachter at a given position ,enter the index :");
	    int index=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Character at "+index+"is "+str.charAt(index));
	    System.out.println("Enter a  strings to compare with given String");
	    String str2=sc.nextLine();
	    System.out.println("after compare"+str2.compareTo(str));
	    System.out.println("enter a character to find its position in the string");
	    String cha=sc.nextLine();
	    System.out.println("position of "+cha+" is  "+str.indexOf(cha));
	    System.out.println("check ends with a given string");
	    String s=sc.nextLine();
	    System.out.println(str.endsWith(s));
	    
	    
	}
	

}
