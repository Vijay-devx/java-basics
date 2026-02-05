
// This is more efficient way to count vowel.
// We used ONLY ONE loop here, we passed vowels inside If conditional using OR operator.
// Time Complexity: O(n)
// Space Complexity: O(1)


import java.util.Scanner;

public class VowelCountEfficient 
{
    static int vowelCount(String s)
    {
        int count = 0;
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word: ");

        String s = sc.next();

        int result = vowelCount(s);

        if(result==0)  // IN CASE, no vowels found, method will return count value as zero.
        {
            System.out.println("NO VOWELS FOUND");
        }
        else
        {
            System.out.println("Vowel Count = "+result);
        }    

        sc.close();
    }
    
}
