
// Finding ASCII value of Character

import java.util.Scanner;

public class AsciiValue 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        int a = sc.next().charAt(0);    //Logic = Store char into int.

        System.out.printf("ASCII value of %c is: %d\n",a,a);

    }
    
}
