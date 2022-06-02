package basicprograms;

import java.util.Scanner;

public class PerfectNo 
{
	public static void main(String args[])
	{
		int n, num=0;
		boolean result;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = r.nextInt();
		result=PerfectNo.perfect(n);
		System.out.println(result);
		
	}
	public static boolean perfect(int n)
	{
		int num=0;
		for(int i=1; i<n; i++)
		{
			
			if(n%i==0)
			{
				num = num+i;
				
			}
		}
		if(num == n)
		{
			return true;
		}
		else
		{
		    return false;
		}
	}
}
