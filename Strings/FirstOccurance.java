
// Find First Occurence of Character.
// shortcut: we can directly use java function:- indexOf();   ----this function finds the index of character inside string--for first occurance. 
// our entire method can be replaced by:- return s.indexOf(find);   ----just add those lowercase lines to make it case-Insensitive.

import java.util.Scanner;

public class FirstOccurance 
{
    static int firstOccur(String s, char find)
    {
        int index = -1;                      // we initializes -1, so that if character is not found, it will return -1, same as in case of indexOf() function, which returns -1 if the character is not found and initializing index=0 will give us wrong answer because if character is not found it will still return us index value as zero, which is wrong.
        s = s.toLowerCase();
        find = Character.toLowerCase(find);

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==find)
            {
                index = i;
                break;                
            }
        }

        return index;

    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Please enter the string: ");
        String s = sc.next();

        System.out.println("Please the character to find: ");
        char find = sc.next().trim().charAt(0);                  //using trim will remove any unwanted spaces in the string and then take 1st character at index 0... we can also go with just s.next().charAt(0); its fine too but if first character in string is a space, it will take that, which will give error, we are just eliminating the chance of any error.
                                                                       // using trim prevents accidental spaces.
        int result = firstOccur(s,find);

        if(result==-1)
        {
            System.out.println("Character NOT FOUND");
        }
        else
        {
            System.out.println("First Occurance index = "+result);
        }    

        sc.close();
    }
    
}
