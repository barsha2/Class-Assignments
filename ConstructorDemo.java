package Oops;


class User
{
int userId;
String userName;
String emailId;


public User(int id,String name,String email)
{
   this.userId=userId;
   this.userName=userName;
   this.emailId=emailId;
   System.out.println("this ref var: "+this);
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
}

}
public class ConstructorDemo 
{
	public static void main(String args[])
	{
		User user=new User(111, "Barsha", "barshapodder2499@gmail.com");
		System.out.println(user);
	}
}
