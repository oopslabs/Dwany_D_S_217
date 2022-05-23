package operation;
import java.util.*;

import arithmetic_operations.arithemtic;

import java.io.*;
public class arith {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		arithemtic ar=new arithemtic();
		ar.sum(a,b);
		ar.sub(a, b);
		ar.mult(a, b);
		ar.div(a, b);
		
		
	}

}
