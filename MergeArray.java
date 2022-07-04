package array;
import java.util.Scanner;

public class MergeArray 
{
	public static void main(String args[])
	{
		int a[]= new int[5];
		int b[]= new int[3];
		int c[]=new int[8];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter elements od array a: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Enter elements of array b: ");
		for(int i =0; i<b.length; i++)
		{
			b[i]= r.nextInt();
		}
		for(int i=0; i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("The merge array is: ");
		 for(int i = 0; i<c.length; i++)
		 {
			 
			 System.out.println(c[i]);
		 }
	}
}
