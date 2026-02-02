//Reading Full Line.


import java.util.Scanner;

public class ReadLine 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Line: ");
        String s = sc.nextLine();                             //sc.nextLine takes lines as input, it counts spaces as well.

        System.out.println("You entered: "+s);
        sc.close();
    }
    
}
