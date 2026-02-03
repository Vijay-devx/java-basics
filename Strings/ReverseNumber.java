
//Reverse a Given Number.

import java.util.Scanner;

public class ReverseNumber 
{
    static void revNum(int n)
    {
        String s = String.valueOf(n);  //converted int to string. 
        
        for(int i=s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);

            System.out.print(c);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Reversed Number: ");
        revNum(n);
        sc.close();
    }
    
}
