
import java.util.Scanner;
class Employee
{
	int empid;
	String name,address;
	float salary;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid :");
		empid=sc.nextInt();
		System.out.println("enter the name:");
	        name=sc.next();
		System.out.println("enter the Address:");
		address=sc.next();
		System.out.println("enter the Salary:");
		salary=sc.nextFloat();
		
	}
	
}
class Teacher extends Employee
{
	String dept,subject;
	Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Dept:");
		dept=sc.next();
		System.out.println("Subject:");
		subject=sc.next();
	}
	void display()
	{
		
		System.out.printf("empid\t\tname\t\taddress\t\tsalary\t\tdept\t\tsub\n");
		System.out.printf(empid+"\t\t"+name+"\t\t"+address+"\t\t"+salary+"\t\t"+dept+"\t\t"+subject+"\n\n");
		
	}
	      public static void main(String args[])
		  {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the no of Employees you want to enter");
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



