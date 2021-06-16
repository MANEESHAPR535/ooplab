public class Sort1
{    
    public static void main(String[] args)
	{        
         int n=5;      
        String arr[] ={"beenas","cinto","unais","zen mariya","ARUN"};			
        String temp;      
        System.out.println("\nStrings before sorting array:"); 
        for (int i = 0; i < 5; i++) {     
            System.out.print(arr[i] + " ");    
        }       
        for (int i = 0; i < 5; i++) 
		{     
            for (int j = i+1; j < 5; j++) 
			{     
               if (arr[i].compareTo(arr[j]) > 0)
			   {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
               
        System.out.println("\n-----------------------");		
        System.out.println("\nAftre sorting alphabitic order: ");    
        for (int i = 0; i <5; i++)
			{     
            System.out.print(arr[i]+"\n");    
        }    
    }    
}    