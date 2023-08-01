package com.kodnest.training.controlconstruct;
import java.util.Scanner;
public class Calculator {
	Scanner scan=new Scanner(System.in);
	void Addition()
	{
		System.out.println("Enter 2 number for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+ " and "+b+ " is  "+ (a+b));
	}
	void Subtration()
	{
		System.out.println("Enter 2 number for subtration");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("subtration of "+a+ " and "+b+ " is  "+ (a-b));
	}
	void Multiplication()
	{
		System.out.println("Enter 2 number for Multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication of "+a+ " and "+b+ " is  "+ (a*b));
	}
	void division()
	{
		System.out.println("Enter 2 number for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("division of "+a+ " and "+b+ " is  "+ (a/b));
	}
	void findingRemainder()
	{
		System.out.println("Enter 2 number for findingRemainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("findingRemainder of "+a+ " and "+b+ " is  "+ (a%b));
	}
	void findSquare()
	{
		System.out.println("Enter 2 number for findSquare");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("findSquare of "+a+ " and "+b+ " is  "+ (a*b));
	}

}
