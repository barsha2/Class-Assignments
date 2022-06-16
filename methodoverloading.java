package Oopsinheritance;

class Helper
{
	public void addition(int a)
	{
		System.out.println("The addition is: " +(a+10));
	}
	public void addition(int a, int b)
	{
		System.out.println("The addition of two integer parameter is: "+ (a+b));
	}
	public void addition(float a, int b)
	{
		System.out.println("The addition of float and integer type parameter is: "+(a+b));
	}
	public void addition(int a, float b)
	{
		System.out.println("The addition of int and float parameter is: "+ (a+b));
	}
}

public class methodoverloading 
{
	public static void main(String args[])
	{
		Helper object = new Helper();
		object.addition(10);
		object.addition(13.4f, 45);
		object.addition(45, 13.4f);
		object.addition(13, 11);
	}
}
