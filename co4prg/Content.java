import java.io.*;
import java.util.Scanner;

class File
{
    String fname;
    void getname()
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name (.text):");
        fname = sc.next();
    }
    void writef() throws Exception
	{
        FileOutputStream fos = new FileOutputStream(fname);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("these the sample content");
    }
    void readf() throws Exception
	{
        FileInputStream fis = new FileInputStream(fname);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}

public class Content 
{
    public static void main(String args[]) throws Exception 
	{
        File f = new File();
        f.getname();
        f.writef();
        f.readf();
    }
}