
//Calculating area of a circle.

import java.util.Scanner;

public class AreaOfCircle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of the circle: ");
        int r = sc.nextInt();
        double pi = 3.14;

        double area = pi * r*r;

        System.out.printf("Area of Circle = %.2f\n", area);
        sc.close();
    }
    
}
