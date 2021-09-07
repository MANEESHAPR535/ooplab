/*CO3PRG-3*/

import java.util.Scanner;
abstract class Shape
{
    abstract void draw();
    abstract void erase();
}

class Circle extends Shape
{   
    int r;
    void draw() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r:");
        r = sc.nextInt();
        System.out.println("Area of circle:"+((3.14f)*(r*r)));
    }
  
    void erase() 
	{
        System.out.println("Circle erased");
    }
}
class Square extends Shape
{
	int a;
    void draw() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        a = sc.nextInt();
        System.out.println("Area of Square:"+(a*a));
    }
    void erase() 
	{
        System.out.println("square erased");
    }
}

class Triangle extends Shape
{
	int b,h;
    void draw() 
	{
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the B:");
        b = sc.nextInt();
        System.out.println("Enter the H:");
        h = sc.nextInt();
        System.out.println("Area of Triangle:"+((0.5f)*(b*h)));
    }
    void erase() 
	{
        System.out.println("Triangle erased");
    }
}
public class Polymor
{
    public static void main(String args[])
	{
        Shape s = new Circle();
        s.draw();
        s.erase();
        s = new Square();
        s.draw();
        s.erase();
        s = new Triangle();
        s.draw();
        s.erase();
    }
}