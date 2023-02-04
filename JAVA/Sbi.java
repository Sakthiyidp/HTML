import java.util.*;
class Banking
{
public String name;
public int mob;
public String add;

public void kyc()
{
System.out.println("Enter Customer name");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("Enter mobile number");
name=sc.nextLine();
}

public void createAccount()
{
String uname;
int pwd;
System.out.println("Enter username");
Scanner sc=new Scanner(System.in);
uname=sc.nextLine();
System.out.println("Enter password");
pwd=sc.nextInt();
}
}

class Sbi extends Banking
{
public static void main(String args[])
{
Sbi s=new Sbi();
s.kyc();
s.createAccount();
}
}
