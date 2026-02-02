/* Reading String(Single Word)
   
   Input: Java
   Output: You entered: Java*/

import java.util.Scanner;
public class ReadWord 
{ 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a String: ");
        String s = sc.next();                                  //we use sc.next() to take string as input.
       
        System.out.println("You entered: "+s);
        sc.close();
    }
    
}
