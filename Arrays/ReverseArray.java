// Reverse Array

import java.util.Scanner;

public class ReverseArray 
{
    static void revArray(int[] arr, int count)
    {
        int[] reverse = new int[count];  //so that out reverse string is as big as count
        int j = 0;

        for(int i=count-1; i>=0; i--)  //Logic:- we will crease another array and copy original array in reverse order in new array.
        {
            int x = arr[i];

            reverse[j] = x;
            j++;
        }

        for(int i=0; i<count; i++)
            {
                System.out.print(reverse[i]+" ");
            }      

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
            System.out.println("NO Numbers Entered.");
        }
        else
        {
            revArray(arr,count);
        }
        sc.close();
    }
    
}
