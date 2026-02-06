
// Compare Two Strings.

import java.util.Scanner; 

public class CompareStrings 
{
    static void stringCompare(String a, String b)
    {

        if(a.length() != b.length())  // in case lenght of strings is not equal, we discard them instantly, out program breaks instantly after return.
        {
            System.out.println("NOT Equal");
            return;                  // direct exit if mismatch.
        }

        
        for(int i=0; i<a.length(); i++)   
        {
            if(a.charAt(i) != b.charAt(i))
            {
                System.out.println("NOT Equal");
                return;
            }
            
        }
        
        System.out.println("Equal");          //if both of above conditional not executed then out program will directly print this.
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two strings: ");

        String a = sc.next();
        String b = sc.next();

        stringCompare(a,b);

        sc.close();
    }
    
}
