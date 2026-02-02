//Simple Interest Calculator


import java.util.Scanner;

public class SimpleInterest 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter principle, rate and time: ");
        int p = sc.nextInt();
        Double r = sc.nextDouble();
        int t = sc.nextInt();

        Double si = (p*r*t)/100 ;

        System.out.println("Simple Interest = "+si);
    }
    
}
