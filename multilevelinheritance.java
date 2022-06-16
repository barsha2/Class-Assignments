package Oopsinheritance;

class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
	
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("meow");
	}
}
class babycat extends Cat
{
	void cute()
	{
		System.out.println("she is so cute");
	}
}

public class multilevelinheritance 
{
	public static void main(String args[])
	{
		babycat baby = new babycat();
		baby.eat();
		baby.meow();
		baby.cute();
	}
}
