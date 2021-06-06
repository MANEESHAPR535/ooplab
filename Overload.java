import java.util.Scanner;
class Overload
{
	float l,b,a;
	double r;
	Scanner sc=new Scanner(System.in);
	
	 void readrect()
	{
		Overload ob=new Overload();
		System.out.println("Enter the length and breadth of rectangle");
		l=sc.nextFloat();
		b=sc.nextFloat();	
		ob.area(l,b);
	}
	
	void readsquare()
	{
		Overload ob=new Overload();
		System.out.println("Enter the side of square");
		a=sc.nextFloat();
		ob.area(a);
	}
	
	void readcircle()
	{
		Overload ob=new Overload();
		System.out.println("Enter the radius of circle");
		r=sc.nextLong();
		ob.area(r);
	}
	
    void area(float a)
    {
        System.out.println("The area of the square is "+Math.pow(a, 2));
    }
    void area(float l, float b)
    {
        System.out.println("The area of the rectangle is "+l*b);
    }
    void area(double r)
    {
        double z = 3.14 * r * r;
        System.out.println("the area of the circle is "+z);
    }
}
class FunctionOverload
{
     public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
	    int choice;
	    Overload b = new Overload();
	   
	   	do
	{
		System.out.print("\nMenu\n1.Rectangle\n2.Square\n3.Cirlce\n4.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:b.readrect();
		break;
		case 2:b.readsquare();
		break;
		case 3:b.readcircle();
		break;
		case 4:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
	}
	}
	while(choice!=5);
	}
}