/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Exercise13 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input Width: ");
        float width = s.nextFloat();

        System.out.print("Input height: ");
        float height = s.nextFloat();

        float area = width * height;
        System.out.println("Area is " + area);

        float perimeter = 2*(width + height);
        System.out.print("Perimeter is " + perimeter);

    }
}
