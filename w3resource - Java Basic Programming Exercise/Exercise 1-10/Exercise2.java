import java.util.Scanner;

public class Exercise2 
{

    /*
     * 2. Write a Java program to print the sum of two numbers.
        Test Data:
        74 + 36
        Expected Output :
        110
     */
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2  = scan.nextInt();

        int ans  = num1 + num2;

        System.out.println("Test Data: ");
        System.out.println("" + num1 + " + " + num2);
        System.out.println("Expected Output : ");
        System.out.println(ans);
        
    }
}
