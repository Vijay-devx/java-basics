
//Temperature Conversion(Celsius to Fahrenheit)

import java.util.Scanner;

public class CelsiusToFahrenheit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature(in degree celsius): ");
        int c = sc.nextInt();

        double f = (c * 9.0/5) + 32;     //Formula for celsius to Fahrenheit conversion.

        System.out.printf("Fahrenheit = %.2f",f);
        sc.close();
    }
    
}
