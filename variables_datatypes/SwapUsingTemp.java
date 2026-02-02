
//Swapping two values (using Temp Variable)

import java.util.Scanner;

public class SwapUsingTemp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("Before Swap: %d  %d\n",a,b);

        int temp = a;     //Swap Logic using Temp Variable
        a = b;
        b = temp;

        System.out.printf("After Swap: %d %d\n",a,b);
        sc.close();

    }
    
}
