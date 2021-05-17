public class Product
{
	int pcode,price;
	String pname;
public static void main(String args[])
{
	Product p1=new Product();
	p1.pcode=101;
	p1.pname="HAMAM";
	p1.price=45;
	
	Product p2=new Product();
	p2.pcode=102;
	p2.pname="LUX";
	p2.price=50;
	 
	Product p3=new Product();
	p3.pcode=103;
	p3.pname="LIFEBOY";
	p3.price=40;
	if(p1.price < p2.price && p1.price<p3.price)
	{
		System.out.println("lowest price product :"+p1.pname+ "\n pcode:"+p1.pcode+ "\nprice:"+p1.price);
	}
		else if(p2.price<p1.price && p2.price<p3.price)
		{
			
	       System.out.println("lowest price product:" +p2.pname+ "\n pcode:" +p2.pcode+"\nprice:"+p2.price);
		}
		   else
		   {
			   System.out.println("lowest price product:" +p3.pname+ "\n pcode:" +p3.pcode+"\nprice:"+p3.price);
		   }
		  
			   
	
    
}
}

	