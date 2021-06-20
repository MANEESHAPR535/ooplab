 import java.util.Scanner;
 class Publisher
 {
	 String name,add;
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the pnmae");
		 name = sc.next();
         System.out.println("address:");
		 add=sc.next();
	 }
	 void display()
	 {
	 System.out.println("DETAILS \n------------------");
	 System.out.println("Publisher name:"+name);
	 System.out.println("Publisher Address:"+add+"\n");
	 }
 }
 class Book extends Publisher
 {
	 String bname,author;
	 int price;
	  Book()
	 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Book Name:");
	 bname=sc.nextLine();
	 System.out.println("Author Name:");
	 author=sc.next();
	 System.out.println("Book Price:");
	 price=sc.nextInt();
	 }
 }
 class Literature extends Book
 {
	  String categoriy;
	  Literature()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Literature categoriy:");
		categoriy=sc.next();
	 }
 }
 class Fiction extends Literature
 {
	String type;
    int chapter;
    Fiction()
	{
		Scanner sc = new Scanner(System .in);
		System.out.println("Type:");
		type = sc.next();
		System.out.println("chapters:");
		chapter = sc.nextInt();
	}		
 
 void display()
 {
	 super.display();
	 System.out.println("Book name:"+bname);
	 System.out.println("Author:"+author);
	 System.out.println("Price:"+price);
	 System.out.println("Category:"+categoriy);
	 System.out.println("Type:"+type);
	 System.out.println("chapter:"+chapter);
     System.out.println("\n");	 
 }
 }
 class Publisher1
 {
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the limit:");
     int n=sc.nextInt();
	Fiction  f[]=new Fiction[n];
		   for (int i=0;i<n;i++)
		    { 
			    f[i]=new Fiction();
		    }
		   for (int i=0;i<n;i++)
		    {
			    f[i].display();
		    }
 }	
 }
  
	 