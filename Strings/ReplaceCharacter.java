
// Replace Character.
// Shortcut method:-  s.replace(oldChar, newChar)        ---this function replaces our entire method logic. 

import java.util.Scanner;

public class ReplaceCharacter 
{
    static String charReplace(String s, char replace, char repWith)
    {
        s = s.toLowerCase();                             // M != m, therefore we first convert entire string to lower case and then compare.
        replace = Character.toLowerCase(replace);        // we convert these characters to lower case as well to avoid any mismatches because of case-sensitivity.
        repWith = Character.toLowerCase(repWith);

        char[] arr = s.toCharArray();                    // Strings are immutable, so we first conver string to array of character, then replace character inside array and convert array of character back to string.
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==replace)
            {
                arr[i] = repWith;
            }
        }
        
        String sNew = new String(arr);                    //now we convert array back int string again after replacing words, remember that we are not modifying original string(s) here.

        return sNew;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the String: ");
        String s = sc.next();

        System.out.print("Please Enter the character to be replaced: ");
        char replace = sc.next().charAt(0);

        System.out.print("Please enter character to be replaced with: ");
        char repWith = sc.next().charAt(0);

        String result = charReplace(s,replace,repWith);

        System.out.print("Replaced String: "+result);

        sc.close();       

    }
    
}
