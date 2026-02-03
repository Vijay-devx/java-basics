
// Find maximum of two numbers

import java.util.Scanner;

public class MaxOfTwo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("Maximum = "+a);
        }
        else
        {
            System.out.println("Maximum = "+b);
        }
        sc.close();
    }
    
}
