import java.util.*;
class Bill
{
	int unit,consumption,rate;
	String name
	
	void getData(int u,int c,int r,String na)
	{
		unit=u;
		consumption=c;
		rate=r;
		name=na;
	}
	void processData()
	{
			displayData();
			calc();
	}
	void calc()
	{
			rate=c-u*30;
			System.out.println("Total Amount"+ );	
	}
	void displayData()
	{

			System.out.println("------------------------------------------------------------");
			System.out.println("\t\t EB BILL");
			System.out.println("------------------------------------------------------------");


			System.out.println("Name:"+name);
			System.out.println("unit:"+u);
			System.out.println("comsumption:"+c);
			
	}

	void result()
	{
			if((m1>=100) &&(m2>=100) &&(m3>=100))
			{
			System.out.println("No need to pay");
			}
			else
			{
			System.out.println("Your Amount");
			}
		}	
}

class mainEB
{
		public static void main(String arg[])
		{

			Scanner sc = new Scanner(System.in);
			Student ob = new Student();

			int r1,m1,m2,m3;
			String nam;
		
			System.out.println("------------------------------------------------------------");
			System.out.println("\t\t EB STATEMENT");

			System.out.println("------------------------------------------------------------");


			System.out.println("Enter the Name:");
			nam = sc.next();
			System.out.println("Enter the Unit:");
			m1 = sc.nextInt();
			System.out.println("Enter the Consumption:");
			m2 = sc.nextInt();


			ob.getData(nam,u,c);
			ob.processData();
	}
}	