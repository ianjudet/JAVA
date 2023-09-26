import java.util.Scanner;

public class gradeAverage 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your 1st grade: ");
        float gradeOne = scan.nextFloat();

        System.out.print("Input your 2nd grade: ");
        float gradeTwo = scan.nextFloat();

        System.out.print("Input your 3rd grade: ");
        float gradeThree = scan.nextFloat();

        System.out.print("Input your 4th grade: ");
        float gradeFour = scan.nextFloat();

        float result = (gradeOne + gradeTwo + gradeThree + gradeFour) / 4;

        if(result <=75)
        {   
            System.out.println("Your grade is: " + result);
            System.out.print("Failed");
        }

        else if(result >= 75 && result <=89.99)
        {
            System.out.println("Your grade is: " + result);
            System.out.print("Passed");
        }

        else if(result >= 90 && result <=94.99)
        {
            System.out.println("Your grade is: " + result);
            System.out.print("With Honors");
        }

        else if(result >= 95 && result <=97.99)
        {
            System.out.println("Your grade is: " + result);
            System.out.print("With High Honors");
        }

        else if(result >= 98 && result <=99.99)
        {
            System.out.println("Your grade is: " + result);
            System.out.print("With Highest Honors");
        }

        else if(result == 100)
        {
            System.out.println("Your grade is: " + result);
            System.out.print("Invalid Grade");
        }

        else{
            System.out.println("Retry");
        }
    }   
}
