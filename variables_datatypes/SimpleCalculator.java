
//Simple Calculator(Using Variables)

import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two values: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double add = a + b;
        double sub = a - b;
        double multi = a * b;
        double div = a / b;

        System.out.printf("Addition = %.2f\n Subtraction = %.2f\n Multiplication = %.2f\n Division = %.2f\n",add,sub,multi,div);
        sc.close();
    }
    
}
