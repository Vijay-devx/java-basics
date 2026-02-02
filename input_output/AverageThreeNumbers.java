
//Calculating average of three numbers.

import java.util.Scanner;

public class AverageThreeNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter three numbers: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        Double avg = (a+b+c)/3;     //average formula.

        System.out.printf("Average = %.2f",avg);
        sc.close();

    }
    
}
