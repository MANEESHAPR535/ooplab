
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
		
		System.out.printf("%5s%10s%10s%10s%10s%10s\n","empid", "name"," address","salary","dept","sub\n");
		System.out.printf("%5d%10s%15s%10.0f%10s%20s\n",empid,name,address,salary,dept,subject);
		
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


/**************************************OUTPUT***************************************8/
Microsoft Windows [Version 10.0.19041.985]
(c) Microsoft Corporation. All rights reserved.

C:\Users\hp>cd/

C:\>cd javaprg

C:\Javaprg>javac empl.java

C:\Javaprg>java Teacher
Enter the no of Employees you want to enter
3
Enter empid :
101
enter the name:
maneesha
enter the Address:
idukki
enter the Salary:
20000
Dept:
cs
Subject:
os
Enter empid :
102
enter the name:
manu
enter the Address:
ekm
enter the Salary:
25000
Dept:
cm
Subject:
business
Enter empid :
103
enter the name:
usha
enter the Address:
kannur
enter the Salary:
30000
Dept:
engineering
Subject:
maths
empid      name   address    salary      dept      sub

  101  maneesha    idukki     20000       cs         os
empid      name   address    salary      dept      sub

  102      manu       ekm     25000       cm   business
empid      name   address    salary      dept      sub

  103      usha    kannur     30000engineering      maths

C:\Javaprg>
