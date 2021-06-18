
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product
 {
  private int pid;
  private String name;
  private int qty;
  private double price;
  private double totalPrice;
  int onum;
  String date;
  
  Product(int pid,String name, int qty, double price, double totalPrice) 
	{
	this.pid=pid;
    this.name = name;
    this.qty = qty;
    this.price = price;
    this.totalPrice = totalPrice;
    }
  
  public static void displayFormat()
  {
      System.out.print("\n ProductId  |   Name  |    Quantity  |  unitprice  | Total Price\n");
	  System.out.println("--------------------------------------------------------------------");
  }

  public void display() 
  {  
     System.out.format("%-9s %9s %8d %20.1f %16.1f\n",pid, name, qty, price, totalPrice);
  }
}

public class Bill 
{
  public static void main(String args[]) 
  {
    	 
    int productid=0;
    String productName = null;
    int quantity = 0;
    double price = 0.0;
    double totalPrice = 0.0;
    double overAllPrice = 0.0;
    char choice = '\0';
	int no;
	String dat;
    Scanner s= new Scanner(System.in);
	System.out.println("Order No: ");
	no = s.nextInt();
	System.out.println("Date: ");
	dat = s.next();
    List<Product> product = new ArrayList<Product>();

    do 
	{
      System.out.println("Enter product details,");
	  System.out.println("enter the Id: ");
	  productid = s.nextInt();
      System.out.print("Name: ");
      productName = s.next();
      System.out.print("Quantity: ");
      quantity = s.nextInt();
      System.out.print("Price (per item): ");
      price = s.nextDouble();

      totalPrice = price * quantity;
      overAllPrice += totalPrice;
	        
	  product.add( new Product(productid,productName, quantity, price, totalPrice) );
      System.out.print("Want to add more item? (y or n): ");
      choice = s.next().charAt(0);
      s.nextLine();
    }
	   while (choice == 'y' || choice == 'Y');
	   System.out.println("\n");
	   System.out.println("Order No:" + no);
	   System.out.println("DATE:" +dat);

       Product.displayFormat();
       for (Product p : product)
		{	
        p.display();
        }
	System.out.println("-------------------------------------------------------------------");
    System.out.println("\n  \t\t\t\t \t\t Net.Amount=" + overAllPrice);
	System.out.println("\t\t\t\t\t\t------------------------\n\t\t\t\t\t\t------------------------");
  }

}