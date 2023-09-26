import java.util.Scanner;

public class Exercise6
{
    /*
     * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
     */

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = s.nextInt();

        System.out.print("Input second number: ");
        int num2 = s.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Expected Output : ");
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quot);
        System.out.println(mod);
        


    }
}
