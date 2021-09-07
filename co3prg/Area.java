/*CO3 PRG1*/
import java.util.Scanner;

abstract class Shape
{
    int l,b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    Scanner sc = new Scanner(System.in);
        void printArea()
		{
             System.out.println("Enter length:");
             super.l=sc.nextInt();
             System.out.println("Enter breath:");
             super.b=sc.nextInt();
             System.out.println("Area of Rectangle:"+(l*b));
        }
}
class Triangle extends Shape
{
    Scanner sc = new Scanner(System.in);
         void printArea()
		 {
             System.out.println("Enter height:");
             super.l=sc.nextInt();
             System.out.println("Enter breath:");
             super.b=sc.nextInt();
             System.out.println("Area of Triangle:"+(0.5*l*b));
         }
}
class Circle extends Shape
{
     Scanner sc = new Scanner(System.in);
         void printArea()
		 {
           System.out.println("Enter height:");
           super.l=sc.nextInt();
           System.out.println("Area of Circle:"+((3.14f)*l*l));
         }
}
public class Area
{
    public static void main(String args[])
	{
        Shape s1 = new Rectangle();
        Shape s2 = new Triangle();
        Shape s3 = new Circle();
        s1.printArea();
        s2.printArea();
        s3.printArea();
    }
}