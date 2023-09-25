import java.util.Scanner;

public class Exercise1 
{
   public static void main(String[] args)
   {
    /*
     * 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
        Expected Output :
        Hello
        Alexandra Abramov
     * 
     */

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter first name: ");
     String fname = scan.nextLine();

     System.out.print("Enter your last name: ");
     String lname = scan.nextLine();

     System.out.println("Hello");
     System.out.print(fname + " " + lname);
   } 

    
}
