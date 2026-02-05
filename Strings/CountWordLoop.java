
// Count Words in a Line using Loop.

import java.util.Scanner;

public class CountWordLoop 
{
    static int wordCount(String s)
    {
        boolean inWord = false;
        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != ' ' && !inWord)
            {
                count++;
                inWord = true;
                
            }
            else if(s.charAt(i)==' ')
            {
                inWord = false;
            }
        }
        return count;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word or line: ");

        String s = sc.nextLine();

        int result = wordCount(s);

        System.out.println("Word count = "+result);

        sc.close();
    }
    
}
