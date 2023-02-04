import java.util.*;
class EB
{
	int u1,c1,r1;
	String name;
	double amount;

	void getData(int uu1,int cc1,int rr1,String nam)
	{
		name=nam;
		u1=uu1;
		c1=cc1;
		r1=rr1;	
	}	
	

	void calc()
	{
		amount=c1-u1*3;
		System.out.println("Amount: "+amount);
		result();
	}

	void displayData()	
	{
	System.out.println("Name:" +name);
	System.out.println("Unit:" +u1);
	System.out.println("Consumption:" +c1);
	System.out.println("Rate:" +r1);
	}

	void result()
	{
			if (amount>100)
			{
				System.out.println("Need to pay");
			}
			else if (amount<100)
			{
				System.out.println("No Need to pay");
			}
	}
}


class mainEB
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			EB obj = new EB();

			int u1,c1,r1;
			String nam;
			
			System.out.println("------------------------------------------------------------");
			System.out.println("\t\t EB-BILL STATEMENT");
			System.out.println("------------------------------------------------------------");

			System.out.println("Enter Your Name");
			nam=sc.nextLine();
			System.out.println("Enter your Unit");
			u1=sc.nextInt();
			System.out.println("Enter your Consumption");
			c1=sc.nextInt();
			System.out.println("Enter your Rate");
			r1=sc.nextInt();
				
			obj.getData(u1,c1,r1,nam);
			obj.displayData();
			obj.calc();			

		}


}