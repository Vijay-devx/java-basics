
//Calculating Percentage

import java.util.Scanner;

public class Percentage 
{
    public static void main(String[] main)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter marks of three subjects and maximum marks: ");
        double m = sc.nextInt();
        double s = sc.nextInt();
        double e = sc.nextInt();
        double t = sc.nextInt();

        double total = m + s + e;

        double percentage =((total/(3*t))*100);     //formula for calculating percentage = marks obtained / maximum marks * 100

        System.out.printf("Percentage = %.2f\n", percentage);
        sc.close();

    }
    
}
