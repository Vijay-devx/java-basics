
//Boolean Example(We will check the Voting Eligibility of a person)

import java.util.Scanner;

public class VotingEligibility 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Age: ");
        int age = sc.nextInt();

        if(age>=18)
        {
            boolean eligibility = true;
            System.out.printf("Eligible to vote: %b\n", eligibility);
        }
        else
        {
            System.out.println("NOT ELIGIBLE");
        }
        sc.close();
    } 
    
}
