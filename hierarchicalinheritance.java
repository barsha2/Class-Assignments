package Oopsinheritance;

class Bank
{
	public void getloaninterest()
	{
		System.out.println("8% is interest rate");
	}
}
class SBI extends Bank
{
	public void CreateAccount()
	{
		System.out.println("Account Created");
	}
}
class HDFC extends Bank
{
	
}
class Axis extends Bank
{
	
}

public class hierarchicalinheritance 
{
	public static void main(String args[])
	{
		Axis axis = new Axis();
		axis.getloaninterest();
		HDFC hdfc = new HDFC();
		hdfc.getloaninterest();
		SBI sbi = new SBI();
		sbi.getloaninterest();
		sbi.CreateAccount();
	}
}
