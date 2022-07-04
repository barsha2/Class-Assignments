package array;

import java.util.Scanner;

public class InsertElements 
{
	
	public static void main(String args[])
	{
		int size, pos, i, num;
		int arr[]= new int[10];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter how many value you want to add in array");
		size=s.nextInt();
		
		System.out.println("Enter array elements: ");
		for(i=0; i<size; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter position: ");
		pos=s.nextInt();
		
		
		//check position is valid or not
		if(pos>size+1 || pos<0)
		{
			System.out.println("The position iyou entered is greater than your size " +size+ "please enter correctly" );
		}
		else
		{
			System.out.println("Enter value you want to enter in position " +pos );
			num=s.nextInt();
			for(i=size; i>=pos; i--)
			{
				arr[i]=arr[i-1];
			}
			arr[pos-1]=num;
			size++;
			
			System.out.println("After adding new value, new array will be: ");
			for(i=0; i<size; i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
