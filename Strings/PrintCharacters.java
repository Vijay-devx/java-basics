
// Print Each Character.

import java.util.Scanner;

public class PrintCharacters 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name = sc.next();
        
        for(int i=0; i<name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
        sc.close();

    }
    
}
