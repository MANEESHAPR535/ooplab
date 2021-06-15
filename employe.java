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
        
		
