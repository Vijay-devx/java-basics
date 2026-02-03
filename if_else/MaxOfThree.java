
//Find Maximum of Three Numbers.

import java.util.Scanner;

public class MaxOfThree 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Maximum = "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Maximum = "+b);
        }
        else
        {
            System.out.println("Maximum = "+c);
        }
        sc.close();
    }
    
}
