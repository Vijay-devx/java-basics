
//Figure out whether a number is Positive, Negative or Zero

import java.util.Scanner;

public class NumberType 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = sc.nextInt();

        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        }
        else if(a==0)
        {
            System.out.println("Zero");
        }
        sc.close();
    }
    
}
