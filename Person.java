
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
		System.out.println("Name\tGender\tAddress\t\tAge\n");
		System.out.printf("%5s%9s%9s%10s\n",name,gender,address,age);
		
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
		System.out.println("\nEmpid\tCompanyName\tQualificarion\tSalary\tDept\tSubject");
		System.out.println(empid+"\t"+cname+"\t\t"+qual+"\t \t"+salary+"\t"+dept+"\t"+sub);
		System.out.println("\n \n");
	
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
	
/*********************************OUTPUT**************************/
C:\Javaprg>javac Person.java

C:\Javaprg>java Teacher
enter the number of teachers:
2
NAME:
Manu
Gender:
f
Address:
idukki
Age:
23
ID:
101
Company name:
sngc
Qualification:
MCA
Salary:
24000
DEPT:
CA
SUB:
OS
NAME:
abhi
Gender:
m
Address:
kannur
Age:
25
ID:
102
Company name:
sng
Qualification:
MBA
Salary:
28000
DEPT:
CE
SUB:
business
Name    Gender  Address         Age

 Manu        f   idukki        23

Empid   CompanyName     Qualificarion   Salary  Dept    Subject
101     sngc            MCA             24000.0 CA      OS



Name    Gender  Address         Age

 abhi        m   kannur        25

Empid   CompanyName     Qualificarion   Salary  Dept    Subject
102     sng             MBA             28000.0 CE      business




C:\Javaprg>

