
//Fnding Maximum number in a given array

import java.util.Scanner;

public class MaxOfArray 
{
    static int maxArray(int[] arr, int count)  //method to find max value.
    {
        int max = arr[0];

        for(int i=1; i<count; i++)   //since i have already assigned arr[0] to max, no need to compare it with itself again, hence i=1;
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count =0;
        System.out.println("Enter your numbers: ");
        
        for(int i=0; i<arr.length; i++)
        {
            int x = sc.nextInt();
            if(x==0)   //our array stops taking input once 0 is entered.
            {
                break;
            }
            arr[i] =x;
            count++;
        }
        if(count==0)   //in case, first number entered is 0.
        {
            System.out.println("No numbers Entered.");
        }
        else
        {
            int result = maxArray(arr,count);
            System.out.printf("Maximum = %d\n",result);
        }
        sc.close();
    }
    
}
