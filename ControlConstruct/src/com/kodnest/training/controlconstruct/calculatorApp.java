package com.kodnest.training.controlconstruct;
import java.util.Scanner;
public class calculatorApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Calculator calculator=new Calculator();
    System.out.println("Hello User Welcome to Kodnest");
    while(true)
    {
    	System.out.println("+   =========>Addition");
    	System.out.println("-   =========>Subtration");
    	System.out.println("*   =========>Multiplication");
    	System.out.println("/   =========>Division");
    	System.out.println("%=========>findRemainder");
    	System.out.println("!   =========>To Stop");
    	System.out.println("Enter your choice");
    	char ch=scan.next().charAt(0);
    	switch(ch)
    	{
    	case'+':calculator.Addition();
    	       break;
    	case'-':calculator.Subtration();
	       break;
    	case'*':calculator.Multiplication();
	       break;
    	case'/':calculator.division();
	       break;
    	case'%':calculator.findingRemainder();
	       break;
    	case'^':calculator.findSquare();
	       break;
    	case'!':System.out.println("ta Taa bye byee see you");
	       break;
	    default:
	    	System.out.println("Go to vaasan eye case and check eyess... see the message properly and enter valid choice");
	    	
	       
	       
    	}
    	
    }
	}

}