package basicprograms;

import java.util.Scanner;

public class CalculateUsingSwitchCase 
{
	public static void addition(int a,int b)
	{
	        System.out.println("addition value: "+ (a+b));
	        
	    }

	public static void substraction(int c,int d)
	{
	System.out.println("substraction value: "+(c-d));
	}
	public static void multiplication(int p,int q)
	{
	System.out.println("multiplication value: "+ (p*q));
	}
	public static void division(int x,int y)
	{
	System.out.println("division value: "+ (x/y));
	}

	 


	public static void main(String[] args) {
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1.for Addition\n2.for substraction\n"
	+ "3.for multiplication\n4.for division\n");
	System.out.println("Enter your choice!");
	choice=sc.nextInt();
	switch(choice) //2
	{
	case 1:addition(12, 10);
	break;
	case 2:substraction(30, 10);
	break;
	case 3:multiplication(10, 10);
	break;
	case 4:division(100, 5);
	break;
	default: System.out.println("wrong choice");
	}

	 

	System.out.println("Thank you");
	}
	}

