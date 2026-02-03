
/* Determine whether a number is Palindrome or Not.

   LOGIC: we will reverse the number and then compare with original number*/

import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int a = n;                      //we saved origonal number.
        int reverse = 0;

        if(n<0)  //Negative Numbers are not Palindrome.
        {
            System.out.println("Negative Numbers are NOT Palindrome");
        }
        else
        {
            while(n!=0)          
            {
                int digit = n%10;                 //Number Reversion Logic
                reverse = reverse*10+digit;
                n = n/10;
            }
        }

        if(a==reverse)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("NOT Palindrome");
        }
        sc.close();
        
    }
    
}
