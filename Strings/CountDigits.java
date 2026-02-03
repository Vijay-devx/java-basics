// Count Digits of a Number Using String.

import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int n = sc.nextInt();

        int length = String.valueOf(n).length();  //we converted int into String and then calculated length of that string and stored that length into int length.

        System.out.println("No. Of Digits = "+length);
        sc.close();
    }
}