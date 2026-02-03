
// Count Digits in a Number 

import java.util.Scanner;

public class CountDigitsWithLoop 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter a Number: ");
       int n = sc.nextInt();
       int count = 0;

       if(n==0)
       {
         System.out.println("No. Of Digits = 1");
       }
        else
        {
            while(n != 0)
            {
                n = n/10;
                count++;
            }
        }
        System.out.printf("No. Of Digits = %d\n",count); 
        sc.close();
    }
    
}


