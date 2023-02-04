import java.util.*;
class Attendence
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		String un,rl;
		System.out.println("\tattendence");

		System.out.println("Enter the Username");
		un = obj.next();
		System.out.println("Enter the Rollno");
		rl = obj.next();

		System.out.println("Username"+un);	
		System.out.println("Roll No"+rl);
	}
}