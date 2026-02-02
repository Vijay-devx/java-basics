// Read Integer and Double;


import java.util.Scanner;

public class ReadIntDouble 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Double value: ");
        Double d = sc.nextDouble();                              //reads decimal value.

        System.out.println("Please enter an Integer: ");
        int a = sc.nextInt();                                    //reads Integer Value.

        System.out.printf("You entered:\n %.2f\n %d ",d,a); //%.2f prints only 2-digits after decimal.
    }
    
}

