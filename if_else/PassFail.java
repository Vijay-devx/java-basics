
//Determine whether pass or fail.

import java.util.Scanner;

public class PassFail 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int m = sc.nextInt();

        if(m>=40)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
        sc.close();
    }
    
}
