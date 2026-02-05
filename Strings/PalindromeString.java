
// Check Palindrome String.

import java.util.Scanner;

public class PalindromeString 
{
    
    static void palinDrome(String s)
    {
        boolean palindrome = true;

        for(int i=0; i<s.length()/2 ; i++)
        {           
            char left = s.charAt(i);
            char right = s.charAt(s.length()-1-i);

            if(left != right)
            {
                System.out.println("NOT PALINDROME");
                palindrome = false;
                break;
            }
        }

        if(palindrome==true)
        {
            System.out.println("PALINDROME");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word: ");

        String s = sc.next();

        palinDrome(s);

        sc.close();

    }
    
}
