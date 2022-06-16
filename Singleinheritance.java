package Oopsinheritance;

class user
{
	public int id;
	public String name;
	public String address;
	public long phno;
	
	public user(int id, String name, String address, long phno)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.phno=phno;
	}
	public void setData(int id, String name, String address, long phno)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phno=phno;
	}
	public void getData()
	{
		System.out.println("Id: " +this.id);
		System.out.println("Name: " +this.name);
		System.out.println("Address: " +this.address);
		System.out.println("Phone no.: " +this.phno);
	}
}
class student extends user
{
	public int rollno;
	public double marks;
	
	public student(int id, String name, String address, long phno, int rollno, double marks)
	{
		super(id,name,address,phno);
		this.rollno = rollno;
		this.marks = marks;
	}
	public void getData()
	{
		super.getData();
		System.out.println("Roll no: " +this.rollno);
		System.out.println("Marks: " + this.marks);
	}
}
public class Singleinheritance 
{
	public static void main(String args[])
	{
		student student1 = new student(111, "Barsha", "Chinarpark", 912336, 34, 89);
		//student1.setData(111, "Barsha", "Chinarpark", 912336, 34, 89);
		student1.getData();
		
	}
}
