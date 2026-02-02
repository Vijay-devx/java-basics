
//Swapping two numbers(without temp)

import java.util.Scanner;

public class SwapNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("Before Swap: %d, %d\n",a,b);

        a = a + b;      //Swap Logic
        b = a - b;
        a = a - b;

        System.out.printf("After Swap = %d, %d\n", a,b);
        sc.close();
    }
    
}
