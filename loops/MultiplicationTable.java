
//Multiplication Table of the Given Number.

import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            int multi = n * i;

            System.out.printf("%d * %d = %d\n",n,i,multi);
        }
        sc.close();
    }
    
}
