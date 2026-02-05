
//Print Lenght of String.

import java.util.Scanner;

public class StringLength 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String s = sc.next();

        int length = s.length();

        System.out.println("String Length = "+length);

        sc.close();
    }
    
}
