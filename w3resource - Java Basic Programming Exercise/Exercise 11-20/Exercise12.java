//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

public class Exercise12
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input Number 1: ");
        float num1 = s.nextFloat();

        System.out.print("Input Number 2: ");
        float num2 = s.nextFloat();

        System.out.print("Input Number 3: ");
        float num3 = s.nextFloat();

        double res = (num1 + num2 + num3)/3;

        System.out.print("The average of the three numbers is : " + res);


    }

    
}
