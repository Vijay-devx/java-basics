
// Count Words in a line.

import java.util.Scanner;

public class CountWords 
{
    static int wordCount(String s)
    {
        if(s.trim().isEmpty())
        {
            return 0;
        }
        else
        {
            String[] words = s.trim().split("\\s+");
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
