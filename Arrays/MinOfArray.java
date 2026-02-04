
// Find Minimum Element of the array.

import java.util.Scanner;

public class MinOfArray 
{
    static int minArray(int[] arr, int count) //Logic:-  we will assume arr[0] as minimum value and compare with other values.
    {
        int min = arr[0];

        for(int i=0; i<count; i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Please enter the numbers: ");
        for(int i=0; i<arr.length; i++)
        {
            int x = sc.nextInt();

            if(x==0)   //this is, so that program stops taking input if zero is entered,kind of breaks for input machine.
            {
                break;
            }
            arr[i] = x;
            count++;
        }

        if(count==0)   //in case, user enters first number as zero(0);

        {
            System.out.println("NO Numbers Entered.");
        }
        else
        {
            int result = minArray(arr,count);
            System.out.println("Minimum Element= "+result);
        }
        sc.close();
    }
    
}
