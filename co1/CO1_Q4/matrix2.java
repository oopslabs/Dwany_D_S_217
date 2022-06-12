package oops;
import java.util.*;
public class matrix2 {

	public static void main(String args[])
	{
		int n1,i,j,flag;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of the matrix\n");
		n1=obj.nextInt();
		System.out.println("enter the elements of the matrix\n");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=obj.nextInt();
				
			}
		}
		
		System.out.println("the matrix is\n");
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n1;j++)
				{
					System.out.print(a[i][j]+"\t");
						
				}
				System.out.println("");
			}
			 flag=1;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println(" Symmetric");
		}
		else
		{
			System.out.println(" not Symmetric");
		}
		
			
			
	}
}
	
