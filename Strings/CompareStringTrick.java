
// we can compare objects like string directly using {.equals()}

import java.util.Scanner;

public class CompareStringTrick 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two strings: ");

        String a = sc.next();
        String b = sc.next();

        if(a.equals(b))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("NOT Equal");
        }
        
        sc.close();
        
    }
    
}
