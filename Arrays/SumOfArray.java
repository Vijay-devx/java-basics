//Calculating the sum of Arrays.

import java.util.Scanner;

public class SumOfArray 
{
    static int arraySum(int[] arr, int count)
    {
        int sum = 0;

        for(int i=0; i<count; i++)
        {
            sum = sum + arr[i];
        }
        return sum;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Please Enter the Numbers: ");
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
            System.out.println("NO NUMBERS ENTERED");
        }
        else
        {
            int Result = arraySum(arr,count);
            System.out.printf("The Sum Of The Array = %d\n", Result);
        }
        sc.close();

    }
    
}
