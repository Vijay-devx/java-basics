
// Count Even Numbers.

// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class CountEven 
{
    static int countEven(int[] arr, int count)
    {
        int evenCount = 0;

        for(int i=0; i<count; i++)
        {
            if(arr[i]%2 ==0)   //Even number logic.
            {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Please enter numbers: ");
        for(int i=0; i<arr.length; i++)
        {
            int x = sc.nextInt();

            if(x==0)
            {
                break;
            }

            arr[i] = x;
            count++;
        }

        if(count==0)
        {
            System.out.println("No Numbers Entered.");
        }
        else
        {
            int result = countEven(arr,count);
            System.out.println("Number of Even Numbers = "+result);
        }
        sc.close();
    }
    
}
