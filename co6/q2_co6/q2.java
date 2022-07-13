package study;
import java.util.*;
import java.io.*;
public class q2 {
public static void main(String args[]) throws Exception
{
	FileWriter fw=new FileWriter("C:\\Users\\dwany\\OneDrive\\Desktop\\dwany",true);
	fw.write("welcome to java ");
	fw.close();
	FileReader fr=new FileReader("C:\\Users\\dwany\\OneDrive\\Desktop\\dwany");
	BufferedReader b=new BufferedReader(fr);
	String i;
	while((i=b.readLine())!=null)
	{
		System.out.println(i);
	}
	fr.close();
	
}
}
