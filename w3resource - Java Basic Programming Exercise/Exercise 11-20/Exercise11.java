/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

import java.util.Scanner;

public class Exercise11 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input radius: ");
        float num = s.nextFloat();

        System.out.print("Radius = ");
        System.out.println(num);

        double perimeter = 2*Math.PI*num;
        double area = Math.PI*Math.pow(num,2);
        
        System.out.print("Perimiter is  = ");
        System.out.println(perimeter);

        System.out.print("Area is = ");
        System.out.println(area);
    }
}
