package com.calc.extendedcalc;
import com.calc.simplecalc.simplec;
import java.util.Scanner;
public class extendedcal extends simplec
{
	public static void main(String args[])
	{
	extendedcal e=new extendedcal();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter First number:");
	int x=sc.nextInt();
	e.setA(x);
	System.out.println("enter Second number:");
	int y=sc.nextInt();
	e.setB(y);
	e.add();
	System.out.println("addition is:"+e.add());
	e.sub();
	System.out.println("subtraction is:"+e.sub());
	}
}
