
/* Largest between two numbers using Ternary Operator.
   
   Ternary Operator Syntax: (condition ? value_if_true : value_if_false) */

import java.util.Scanner;

public class TernaryMax 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a>b ? a : b;     //we use Tertiary Operator

        System.out.println("Maximum = "+max);
        sc.close();
    }
    
}
