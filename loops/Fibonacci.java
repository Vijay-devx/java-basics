
/* Fibonacci Series(n terms)
   
   The Fibonacci series is a sequence of numbers where each number is the sum of the two previous numbers.
   Next Number = previous number + number before that */


import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        if(n<=0)     //in case, user enters zero or negative value.
        {
            System.out.println("Please Enter a positive number");
            return;
        }
        if(n==1)     //in case user enters 1, fibonacci starts from zero, so first value will be zero.
        {
            System.out.println(0);
            return;
        }

        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);

        
        for(int i=1; i<=n-2; i++)
        {
            int fibo = a + b;

            System.out.print(" "+fibo);

            a = b;
            b = fibo;
        }
        sc.close();
    }

    
}
