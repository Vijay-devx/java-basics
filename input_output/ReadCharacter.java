
//Reading Character.

import java.util.Scanner;

public class ReadCharacter 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char a = sc.next().charAt(0);

        System.out.printf("Character = %c\n", a);
        sc.close();
    }
    
}
