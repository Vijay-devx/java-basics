
// Copy one array to another.
// Java provides standard java built-in library to copy arrays. 
// here we can write in shortcut this entire method as: 
/*  static int[] arrayCopy(int[] arr, int count)
   { 
       return java.util.Arrays.copyOf(arr,count);      
   }
*/

/* another Built-in way:
     
      int[] copy = new int[count];
      System.arraycopy(arr, 0, copy, 0, count);
*/      

import java.util.Scanner;

public class CopyArray 
{
    static int[] arrayCopy(int[] arr, int count)
    {
        int[] copy = new int[count];

        for(int i=0; i<count; i++)
        {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int count = UserInput.userInput(arr,sc);  //called the user input function from file UserInput.java to take array input.

        if(count==0)
        {
            System.out.println("No Elements Entered.");
        }
        else
        {
            int[] copy = arrayCopy(arr,count);
            
            for(int i=0; i<count; i++)
            {
                System.out.print(copy[i]+" ");
            }
        }
        sc.close();
    }
    
}
