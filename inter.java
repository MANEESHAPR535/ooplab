import java.util.Scanner;
interface Prototypes
{
	void area();
	void perimeter();
}
class Circle implements Prototypes
{
  double pi=3.14;
  double r;
 Circle()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter r:");
  r=sc.nextInt(); 
  }
  public void area()
  {
	  System.out.println("Area of Circle ="+pi*r*r);
  } 
   
	public void perimeter()
	{	
	  System.out.println("perimeter of Circle="+2*pi*r);
	}
  	  
}
class Rectangle implements Prototypes
{
	int w,l;
	Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the value of w,l:");
		w=sc.nextInt();
		l=sc.nextInt();
	}
	 
	public void area()
	{
		System.out.println("area of rectangle="+w*l);
	}
	 
	public void perimeter()
	{	
		System.out.println("perimeter of rectangle ="+(2*(w+l)));
	}
	
}

public class inter
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.area();
		c.perimeter();
		r.area();
		r.perimeter();
	}
}

	
