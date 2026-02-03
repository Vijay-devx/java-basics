
// Reverse a Given Number.

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int n = sc.nextInt();
        int reverse = 0;

        if(n==0)
        {
            System.out.println(n);
        }
        else
        {
            while(n!=0)
            {
                int digits = n % 10;  //Extract Last Digit.
                reverse = reverse*10+digits;  //attach the extracted digit
                n = n/10;             // deleting the last digit
            }
            System.out.printf("Reversed Number = %d\n",reverse);
        }
        sc.close();
    }

    
}
