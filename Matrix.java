import java.util.Scanner;
class Matrix
{ 
	int r,c;
	int a[][];
	Matrix(int x,int y)
	{
		this.r=x;
		this.c=y;
	}
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
	
	}
	
	void add(Matrix M1,Matrix M2)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 a[i][j]=M1.a[i][j]+M2.a[i][j];
			}    	 
		}
	}
	void display()
	{
		System.out.println("After addition:\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	     
	}
				
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and coloumns of matrix");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Matrix M1=new Matrix(x,y);
		M1.a=new int[x][y];
		M1.read();
		Matrix M2=new Matrix(x,y);
		M2.a=new int[x][y];
		M2.read();
		Matrix M3=new Matrix(x,y);
		M3.a=new int[x][y];
		M3.add(M1,M2);
		M3.display();
		
	}
}




