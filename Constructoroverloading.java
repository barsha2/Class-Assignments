package Oops;

class Employee
{
	int empId;
	String empName, empAdd;
	long phno;
	double salary;
	String city, country;
	
	//constructor to initialize id, name, add
	public Employee(int empId, String empName, String empAdd)
	{
		this.empId=empId;
		this.empName=empName;
		this.empAdd=empAdd;
				
	}
	//constructor to initialize salary and phno
	public Employee(int empId, String empName, String empAdd, double salary, long phno)
	{
		this(empId,empName,empAdd);
		this.phno=phno;
		this.salary=salary;
		
	}
	//constructor to initialize city and country
	public Employee(int empId, String empName, String empAdd, double salary, long phno, String city, String country)
	{
		this(empId,empName,empAdd,salary,phno);
		this.city=city;
		this.country=country;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public long getPhno() {
		return phno;
	}
	public double getSalary() {
		return salary;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	
}

public class Constructoroverloading 
{
	public static void main(String args[])
	{
		Employee employee1 = new Employee(111, "Barsha", "Chinarpark");
		System.out.println(employee1.getEmpId()+" "+ employee1.getEmpName()+ " "+ employee1.getEmpAdd());
		Employee employee2 = new Employee(112, "Misti", "Airport", 50000, 913359);
		System.out.println(employee2.getEmpId()+ " "+ employee2.getEmpName()+" "+employee2.getEmpAdd()+" "+ employee2.getSalary()+" "+ employee2.getPhno());
		Employee employee3 = new Employee(113, "Shirsha", "garia", 30000, 912376, "Kolkata", "India");
		System.out.println(employee3.getEmpAdd()+ " "+employee3.getEmpName()+ " "+employee3.getEmpAdd()+ " "+ employee3.getSalary()+" "+employee3.getPhno()+" "+employee3.getCity()+" "+employee3.getCountry());
		
	}
}
