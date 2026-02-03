
// Count Digits in a Number 

import java.util.Scanner;

public class CountDigits 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter a Number: ");
       int n = sc.nextInt();
       int count = 0;

       if(n==0)     //this accounts in case value entered is zero(0).
       {
         System.out.println("No. Of Digits = 1");
       }
        else
        {
            while(n != 0)  
            {
                n = n/10;  //since n is an int value, dividing it by 10 will chop off last digit, it won't be converted into decimal, so the loop will end once last digit is divided by 10.
                count++;
            }
        }
        System.out.printf("No. Of Digits = %d\n",count); 
        sc.close();
    }
    
}


