
// Determine Second Largest Element.

import java.util.Scanner;

public class SecondLargest 
{
    static int secLarge(int[] arr, int count)
    {
        int max = arr[0];
        int secMax = arr[1];

        if(max<secMax)    
        {
            int temp = max;
            max = secMax;
            secMax = temp;
        }

        for(int i=0; i<count; i++) //if current>max-----shift max to secMax
        {
            if(arr[i]>max)
            {
                secMax = max;
                max = arr[i];
            }
            
            else if(arr[i]>secMax && arr[i] != max) //if between max and secMax-----update secMax
            {
                secMax = arr[i];
            }
        }
        return secMax;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int count = UserInput.userInput(arr,sc);

        if(count==0)
        {
            System.out.println("No Numbers Entered.");
        }

        else if(count<2)   //as we need atleast 2 elements to find second largest.
        {
            System.out.println("Need at leat two elements: ");
        }

        else
        {
            int result = secLarge(arr,count);
            System.out.println("Second Largest Element = "+result);
        }
        sc.close();
    }
    
}
