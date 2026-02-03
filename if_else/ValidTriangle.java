
//Validate whether three sides will form a triangle or not. 

import java.util.Scanner;

public class ValidTriangle 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter three sides of a Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("NOT VALID");
        }
        sc.close();
    }
    
}
