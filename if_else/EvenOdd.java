
//Check Even or Odd.

import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = sc.nextInt();

        if((a%2)==0)   // we find remainder by using %, LOGIC:- if number when divided by 2 gives 0 remainder, its an even number, else its odd.
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        sc.close();

    }
    
}
