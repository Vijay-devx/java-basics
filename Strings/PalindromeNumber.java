
// Determine Whether a Number is Palindrome or Not Using String.

import java.util.Scanner;

public class PalindromeNumber 
{
    static void paliNum(int n)
    {
        String s = String.valueOf(n);
        int len = s.length();
        boolean isPali = true;

        for(int i=0; i<len/2; i++)  //we only need to check upto middle
        {
            if(s.charAt(i)!= s.charAt(len-1-i))  //compare front character with back character
            {
                isPali = false;
                break;   //No need to check further
            }
        }
        if(isPali)
        {
            System.out.println("The Number is a Palindrome.");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        paliNum(n);
        sc.close();
    }
    
}
