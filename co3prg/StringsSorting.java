
/*CO3PRG-7*/

import java.util.Arrays;
class StringsSorting 
{    
   private static String[]str = {"Zen", "maneesha", "cirl", "America", "you", "done","do", "night", "why", "orange","a"};
    
    public enum Adsc
	{
       ASC, DESC
    }
    
    public static void main(String args[]) 
	{
        System.out.println("\n The given String is: " + Arrays.toString(str));
        sortA(str, Adsc.DESC);
        System.out.println("\n Descending order of String: " + Arrays.toString(str));
        sortA(str, Adsc.ASC);
        System.out.println("\n Ascending order String: " + Arrays.toString(str));            
   }
   public static void sortA(String[] str, Adsc direction)
   {
       if (str == null || direction == null || str.length == 0) 
	   {
           return;
       }
       if (direction.equals(Adsc.ASC))
	   {
           Arrays.sort(str, (String str1, String str2)
                   -> Integer.compare(str1.length(), str2.length()));
       }
	   else if (direction.equals(Adsc.DESC))
	   {
           Arrays.sort(str, (String str1, String str2)
                   -> (-1) * Integer.compare(str1.length(), str2.length()));
       }
   }
}