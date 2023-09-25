import java.util.Scanner;

public class Exercise5 
{
    /*
     * 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
    Test Data:
    Input first number: 25
    Input second number: 5
    Expected Output :
    25 x 5 = 125
     */

     public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scan.nextInt();

        System.out.print("Input second number: ");
        int num2 = scan.nextInt();

        int ans = num1 * num2;
        System.out.println("Expected Output : ");
        System.out.println("" +num1 +" x "+num2 + " = " +ans);
     }
}
