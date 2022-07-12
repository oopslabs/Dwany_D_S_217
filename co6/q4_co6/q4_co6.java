package study;
import java.io.*;
import java.util.*;

public class q4_co6 {
public static void main(String args[])throws IOException
{
	FileInputStream fr=new FileInputStream("C:\\Users\\dwany\\OneDrive\\Desktop\\integer.txt");
	FileOutputStream fw1=new FileOutputStream("C:\\Users\\dwany\\OneDrive\\Desktop\\even.txt");
	FileOutputStream fw2=new FileOutputStream("C:\\Users\\dwany\\OneDrive\\Desktop\\odd.txt");
	int i;
	System.out.println("copied successfully");
	while((i=fr.read())!=-1)
			{
		if(i%2==0)
		{
			fw1.write(i);
		}
		else
		{
			fw2.write(i);
		}
			}
	fr.close();
	fw1.close();
	fw2.close();

}
}
