
//Claculating Area of Triangle.

import java.util.Scanner;

public class AreaOfTriangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Base and Height of the triangle: ");
        int b = sc.nextInt();
        int h = sc.nextInt();

        double Area = 0.5*b*h;    //formula for calculating area of triangle.

        System.out.println("Area of Triangle = "+Area);
    }
    
}
