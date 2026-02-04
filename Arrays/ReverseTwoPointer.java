
//Reverse an Array using Two pointer Swapping;

import java.util.Scanner;

public class ReverseTwoPointer 
{
    static void reverseArray(int[] arr, int count)
    {
        int left = 0;                // Swapping numbers using two pointer technique.
        int right = count-1;

        while(left<right)  
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for(int i=0; i<count; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Please enter the elements(enter 0 to stop): ");

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
            System.out.println("No Elements Entered");
        }
        else
        {
            reverseArray(arr,count);
        }
        sc.close();
    }
    
}
