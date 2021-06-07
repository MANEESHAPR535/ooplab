import java.util.Scanner;
interface student 
{
    Scanner sc = new Scanner(System.in);
    int roll = 30, OS = 85,OOPs=96,BM=95;
    String name = "MANEESHA PR", classname = "MCA";
    int total=OS+OOPs+BM;
	
}
class sports
{
    Scanner sc = new Scanner(System.in);
    int marks;
    void getData()
    {
        System.out.println("Enter marks out of 20:");
        marks=sc.nextInt();
    }
}

class result extends sports implements student
{
    void display()
    {
	System.out.println("************************");
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
	System.out.println("os:"+OS);
	System.out.println("OOP:"+OOPs);
	System.out.println("BM:"+BM);
	System.out.println("total Mark of sub:"+total);
        System.out.println("Sports Mark:"+marks);
		 float gt=(float)total+(float)marks;
		 System.out.println("Accademic marks:"+gt);
		 float perc=(float)gt/300*100;
		  System.out.println("percentage:"+perc);
    }
}
public class studentdet 
{
    public static void main(String args[])
    {
        result res = new result();
        res.getData();
        res.display();
    }
}



/***************************OUTPUT***********************/


C:\Javaprg>javac Studentdet.java

C:\Javaprg>java studentdet
Enter marks out of 20:
17
************************
Details of students are:
Name:MANEESHA PR
Roll number:30
Class Name:MCA
os:85
OOP:96
BM:95
total Mark of sub:276
Sports Mark:17
Accademic marks:293.0
percentage:97.66667

C:\Javaprg>





