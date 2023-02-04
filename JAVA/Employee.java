class Employee
{
	public static void main(String args[])
{
	String gender="Female";
	String status="Married";
	
	double aw;
	double bp=15000;

	if(gender=="Female")
	{
	  if(status=="married")
	  {
	   System.out.println("Company will offer creche");	
	}
	else
	{
	   bp=bp*5/100;
	   System.out.println("Gn:Female status:unmarried Basic pay:"+bp);
	}
      }
	else
	{
	   bp=bp*2/100;
	   System.out.println("Gn:Male Basic pay:"+bp);
	}
      }
	  
}