
// Count Words in a line.

import java.util.Scanner;

public class CountWordsShortcut 
{
    static int wordCount(String s)
    {
        if(s.trim().isEmpty())    // IN case word contains only spaces.
        {
            return 0;
        }
        else
        {
            String[] words = s.trim().split("\\s+");  //we split the sentence at whitespaces, store them in in array and length of that array will be our word count.
            return words.length;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter word or Line: ");
        String s = sc.nextLine();

        int result = wordCount(s);

        System.out.println("Word Count = "+result);

        sc.close();
    }
    
}
