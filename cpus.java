

class CPU 
{
    int price;
    CPU(int price)
    {
        this.price=price;
		System.out.println("price:"+price);
    }
    class  processor{
        processor(double Processor,String manufcturer)
        {
            System.out.println("Processor:"+Processor+ "GHz");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"GB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
public class cpus
{
    public static void main(String args[])
    {

        CPU c = new CPU(20000);
        CPU.processor pr=c.new processor(2.60,"hp");
        new CPU.RAM(4,"hp");

    }
}