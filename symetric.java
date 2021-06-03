import java.util.Scanner;
class Symetric
{
	int a[][];
	int r,c;
	Symetric(int r,int c)
	{
		this.r=r;
		this.c=c;
	}
	void read()
	{
		System.out.println("Enter the elements");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void check()
	{
		int flag=0;
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					 flag=1;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("This is not symetric");
		    
		}
		else
		{
			System.out.println("This is Symetric");
		}
	}
	public static void main(String ab[])
	{
		System.out.println("Enter number of rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		int k=sc.nextInt();
		Symetric m=new Symetric(j,k);
		m.a=new int[j][k];
		m.read();
		m.check();
	}
}


/******************************OUTPUT*****************************/
Microsoft Windows [Version 10.0.19041.985]
(c) Microsoft Corporation. All rights reserved.

C:\Users\hp>cd/

C:\>cd javaprg

C:\Javaprg> javac symetric.java

C:\Javaprg>java Symetric
Enter how many rows and coloumns
3 3
Enter the elements
1 1 -1
1 2 0
-1 0 5
This is Symetric

C:\Javaprg>java Symetric
Enter how many rows and coloumns
3 3
Enter the elements
1 2 3
3 4 5
3 5 0
This is not symetric

C:\Javaprg>
