import java.util.Scanner;

public class Exercise3 

/*
 * 3. Write a Java program to divide two numbers and print them on the screen.
    Test Data :
    50/3
    Expected Output :
    16
 */
{
   public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int num1 = scan.nextInt();

    System.out.print("Enter 2nd number: ");
    int num2 = scan.nextInt();

    int ans = num1/num2;
    
    System.out.println("Test Data: ");
    System.out.println("" + num1 + "/" + num2);
    System.out.println("Expected Output : ");
    System.out.println(ans);
   } 
}
