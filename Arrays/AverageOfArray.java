
//Calculate Average Of Elements.

import java.util.Scanner;

public class AverageOfArray 
{
    static double avgArray(int[] arr, int count)
    {
        int sum = 0;
        double avg = 0;

        for(int i=0; i<count; i++)
        {
            sum = sum + arr[i];
            avg = (sum)/(i+1.0);
        }
        return avg;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int count = UserInput.userInput(arr,sc); //we called a method named userInput() from class UserInput from file UserInput.java to take inputs.
                                                 // we didn't wanted to write that user input program again and again, hence we created a method itselt to take input from user.
        if(count==0)                             // All we have to do it call the function and pass the required variables, method will do its job automatically
        {
            System.out.println("NO Numbers Entered.");
        }
        else
        {
            double result = avgArray(arr,count);
            System.out.println("Average of Array = "+result);
        }
        sc.close();
    }         
}
