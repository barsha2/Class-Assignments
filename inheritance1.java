package Oopsinheritance;

class employee
{
	public int empid;
	public String empname;
	public String dept;
	public long phno;
	
	public void setData(int empid, String empname, String dept, long phno)
	{
		this.empid=empid;
		this.empname = empname;
		this.dept = dept;
		this.phno = phno;
		
	}
	public void getData()
	{
		System.out.println("Employee Id: " +this.empid);
		System.out.println("Employee name: " +this.empname);
		System.out.println("Department: " +this.dept);
		System.out.println("Phone number: " +this.phno);
	}
}
class office extends employee
{
	
}
public class inheritance1 
{
	public static void main(String args[])
	{
		office employee1 = new office();
		employee1.setData(111, "Barsha", "abc", 912336);
		employee1.getData();
	}
}
