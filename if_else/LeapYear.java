
//Leap Year Check

import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the year in YYYY format: ");
        int year = sc.nextInt();

        if(year%400==0 || (year%4==0 && year%100 != 0))    /*If a year is either divisible by 400 OR 
                                                               is divisible by 4 and not divisible by 100, then its a leap year. */
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
    
}
