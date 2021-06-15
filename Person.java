
import java.util.Scanner;
class Person
{
	String name,gender,address;
	int age;
	Person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("NAME:");
		name=sc.next();
		System.out.println("Gender:");
		gender=sc.next();
		System.out.println("Address:");
		address=sc.next();
		System.out.println("Age:");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("\nName:"+name+"\n Gender:"+gender+" \n Address:"+address+"\n Age:"+age);
		
	}
	
}
class Employee extends Person
{
	int empid;
	String cname,qual;
	float salary;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ID:");
		empid=sc.nextInt();
		System.out.println("Company name:");
		cname=sc.next();
		System.out.println("Qualification:");
		qual=sc.next();
		System.out.println("Salary:");
		salary=sc.nextFloat();
		
	}
}

class Teacher extends Employee
{  String dept,sub;
	Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("DEPT:");
		dept=sc.next();
		System.out.println("SUB:");
		sub=sc.next();
	}
	void display()
	{
		super.display();
		System.out.println("Empid:"+empid+"\n CompanyName:"+cname+"\n Qualificarion:"+qual+"\n Salary:"+salary+"\n Dept:"+dept+"\n Subject:"+sub+"\n");
		System.out.println("------------------------------------");	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of teachers:");
		int n=sc.nextInt();
		Teacher t[]=new Teacher[n];
		   for (int i=0;i<n;i++)
		    { 
			    t[i]=new Teacher();
		    }
		   for (int i=0;i<n;i++)
		    {
			    t[i].display();
		    }
	}
	}
	


