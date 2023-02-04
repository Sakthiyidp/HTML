import java.util.*;
class Bill
{
	int unit,consumption,rate;
	String name;
	
	void getData(int m1,int m2,int m3,String na)
	{
		unit=m1;
		consumption=m2;
		rate=m3;
		name=na;
	}
	void processData()
	{
			displayData();
			calc();
	}
	void calc()
	{
			rate=m2-m1*30;
			consumption=m2-m1;
			System.out.println("Total Amount"+total);
			System.out.println("Average: "+avg);
			grade();
			result();
	
	}
	void displayData()
	{

			System.out.println("------------------------------------------------------------");
			System.out.println("\t\t EB BILL");
			System.out.println("------------------------------------------------------------");


			System.out.println("Name:"+na);
			System.out.println("unit:"+m1);
			System.out.println("comsumption:"+m2);
			
	}
	void grade()
		{
			if(consumption >=80)
			{
					System.out.println("Very High Usage");
			}
			else if((consumption>=60) && (consumption<80))
			{
					System.out.println("High Usage");
			}
			else if((consumption>=50) && (consumption<60))
			{
					System.out.println("Mediun Usage");
			}
			else if((consumption>=40) && (consumption<50))
			{
					System.out.println("Low Usage");
			}
			else
			{
					System.out.println("Didn't Use");
}
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
			Bill ob = new EB();

			int r,m1,m2,m3;
			String na;
		
			System.out.println("------------------------------------------------------------");
			System.out.println("\t\t EB STATEMENT");

			System.out.println("------------------------------------------------------------");


			System.out.println("Enter the Name:");
			na = sc.next();
			System.out.println("Enter the Unit:");
			m1 = sc.nextInt();
			System.out.println("Enter the Consumption:");
			m2 = sc.nextInt();
			System.out.println("Enter the Consumption:");
			m3 = sc.nextInt();

			ob.getData(na,m1,m2);
			ob.processData();
	}
}	