/*CO3PRG-6*/

import java.util.Scanner;
public class Reverse
 {
 public void reverseString(String str) 
 {
  String[] s = str.split(" ");
  String revString = "";
  for (int i = 0; i < s.length; i++)
	  {
         String word = s[i];
         String reverseWord = "";
  for (int j = word.length() - 1; j >= 0; j--)
	   {
           reverseWord = reverseWord + word.charAt(j);
       }
          revString = revString + reverseWord + " ";
       }
          System.out.println(revString);
  }
 public static void main(String args[])
 {
  Reverse obj = new Reverse();
  String Str1 = "MANEESHA PR SNG20MCA";
  System.out.println("The given string is:" + Str1);
  System.out.println("\n");
  System.out.println("The string reversed is:");
  obj.reverseString(Str1);
 }
}