
// Print all elements of Array.

import java.util.Scanner;

public class PrintArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
         
        System.out.println("Please Enter the each element of Array: ");
         for(int i=0; i<arr.length; i++)
         {
            int x = sc.nextInt();

            arr[i] = x;
         }

         for(int i=0; i<arr.length; i++)
         {
            System.out.print(arr[i]+" ");
         }
         sc.close();
        
    }
    
}
