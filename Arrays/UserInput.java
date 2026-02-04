
//Take user input for array amd use this Class in various programs.


import java.util.Scanner;

public class UserInput 
{
    static int userInput(int[] arr, Scanner sc)
    {
        int count = 0;

        System.out.println("Please enter the numbers(enter 0 to stop): ");

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
        return count;
    }
    
}
