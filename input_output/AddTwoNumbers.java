/* Adding Two Numbers
   Input: 4
          6
   Output: Sum = 10 */


import java.util.Scanner;

public class AddTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum= a + b;
        System.out.println("Sum = "+sum);
        sc.close();
    }
    
}
