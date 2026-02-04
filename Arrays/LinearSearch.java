
// Search an Element (Linear Search)
// input: 10 20 30 40 50,
// Element to be searched: 30
// Output: Found


import java.util.Scanner;

public class LinearSearch 
{
    static void linearSearch(int[] arr, int count, int search)
    {
        boolean found = false;
                
        for(int i=0; i<count; i++)
        {
            
            if(arr[i]==search)
            {
                System.out.println("FOUND");
                found = true;
                break;
            }            
        }

        if(found==false)
        {
            System.out.println("NOT FOUND");
        }
         
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int count = UserInput.userInput(arr,sc);   // we called the method to take input.

        System.out.println("Please enter number to search: ");
        int search = sc.nextInt();

        if(count==0)
        {
            System.out.println("NO Numbers Entered.");
        }
        else
        {
             linearSearch(arr,count,search);
        }
        sc.close();
    }
    
}
