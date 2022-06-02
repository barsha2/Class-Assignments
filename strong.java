package basicprograms;

import java.util.Scanner;

public class strong 
{
	public static void main(String args[])
	{
		int n, rem, fact=1, sum=0, temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt(); // 145
		temp = n; //145
		while(temp>0)
		{
			rem = temp%10; //5
			fact=1;
			factorial(rem);
			
			sum = sum+fact;
			temp=temp/10; // 14
			
		}
		if(n==sum)
		{
			System.out.println("The number is strong number");
		}
		else
		{
			System.out.println("The number isn't the strong number");
		}
	}
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1; i<=num; i++) // 1<5
		{
			fact= fact*i; // f = 1*1
			
		}
		return fact;
		
	}
}
