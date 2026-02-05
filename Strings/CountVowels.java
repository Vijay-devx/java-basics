
// Count Vowels
/* Current Time Complexity: n = length of string, 5= no of vowels
   outer loop - n times
   iner loop - 5 times
   therefore, Time complexity = n * 5 --O(5n) ----which technically equals to O(n).
*/
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class CountVowels 
{
    static int vowelCount(String s)
    {
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        s = s.toLowerCase();   // Convert String to lower case to make is case-INsensitive.
        for(int i=0; i<s.length(); i++)
        {
            for(int j=0; j<vowels.length; j++)
            {
                
                if(s.charAt(i)==vowels[j])
                {
                    count++;
                }
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
