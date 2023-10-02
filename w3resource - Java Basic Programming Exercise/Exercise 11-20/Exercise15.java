//15. Write a Java program to swap two variables.

public class Exercise15 
{
    public static void main(String[] args)
    {

        int a = 15;
        int b = 30;
        
        System.out.println("Before swapping variables " + a + " "+ b);
        
        int temp = a;
        a = b;
        b = temp;

        System.out.print("After swapping variables " + a + " "+ b);

    }
}
