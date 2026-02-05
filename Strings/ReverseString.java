
//Reverse a String.
// input: code
// output: edoc

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word: ");

        String s = sc.next();

        System.out.print("Reversed Word is: ");

        for(int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }

        sc.close();
    }
    
}
