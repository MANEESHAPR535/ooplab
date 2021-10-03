
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

      class ReadWrite 
         {

            public static void main(String args[])
             {

         try {

      FileReader r = new FileReader("write.txt");
      FileWriter w = new FileWriter("read.txt");
      String str = "";

      int i;
      while ((i = r.read()) != -1) 
	  {

        str += (char)i;
      }
      w.write(str);
      r.close();
      w.close();

      System.out.println("File reading and writing both done");
    }
    catch (IOException e) 
    {
      System.out.println("There are some IOException");
    }
  }
}