/*Read ad Print Integer
  Input: 5
  Output: Yout entered: 5 */


import java.util.Scanner;  //Scanner takes input from user.

  public class ReadInteger 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //declared the scanner

        System.out.println("Please Enter an Integer: ");
        int a = sc.nextInt();  //this will store next integer value entered into a.

        System.out.println("You entered: "+a);

    }
    
}
