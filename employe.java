import java.util.Scanner;

class Employee 
{
	int eno;
	float esalary;
	String ename;

	public static void main(String[] args) {
		 int flag=0,n,x,i;
		Scanner sc=new Scanner(System.in);
		Employee[] emp=new Employee[100];
		System.out.println("Enter the no of employees");
		 n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Employee No:");
			emp[i]=new Employee();
			emp[i].eno=sc.nextInt();
			System.out.println("Enter Employee Name:");
		    emp[i].ename=sc.next();
			System.out.println("Enter Employee Salary:");
			emp[i].esalary=sc.nextFloat();
			
		}
		System.out.println("Enter the employee id you want to find :");
		 x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(emp[i].eno==x)
			{
				 flag = 1;
                break;
			}
			 else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
				System.out.println("Employee found at postion:"  + (i + 1) +"\n eid:" +emp[i].eno+"\n name:" +emp[i].ename+"\n salary:"+emp[i].esalary );
        }
        else
        {
            System.out.println("Employee not found");
        }
    }
}
        
		
		/*********************************OUTPUT**********************************************/
		Microsoft Windows [Version 10.0.19041.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\hp>cd/

C:\>cd javaprg

C:\Javaprg>javac Employe.java

C:\Javaprg>java Employee
Enter the no of employees
4
Enter Employee No:
101
Enter Employee Name:
ABHIN
Enter Employee Salary:
50000
Enter Employee No:
102
Enter Employee Name:
MANEE
Enter Employee Salary:
25000
Enter Employee No:
103
Enter Employee Name:
ARUN
Enter Employee Salary:
30000
Enter Employee No:
104
Enter Employee Name:
RAHUL
Enter Employee Salary:
40000
Enter the employee id you want to find :
103
Employee found at postion:3
 eid:103
 name:ARUN
 salary:30000.0

C:\Javaprg>