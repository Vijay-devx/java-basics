
// Convert to Uppercase.

import java.util.Scanner;

public class ToUppercase 
{
    static void uppercase(String s)
    {
        s = s.toUpperCase();          // OR we can directly use :- return s.toUpperCase();   to the method call and print values inside main.,
                                      // in that case use : static String , instead od static void.
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");

        String s = sc.next();

        uppercase(s);

        sc.close();
    }
    
}
