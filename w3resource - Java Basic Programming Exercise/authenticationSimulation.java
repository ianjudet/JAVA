import java.util.Scanner;

public class authenticationSimulation 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String names[] = {"Juan", "Joseph", "Peter"};

        String pword[] = {"Taiwan", "Philippines", "Canada"};

        System.out.print("Username: " );
        String search = s.nextLine();

        System.out.print("Password: ");
        String searchP = s.nextLine();

        // Iteration of the array
        for(int i = 0; i <= names.length && i <= pword.length; i++)
        {
            // Checking if names array corresponds to the password array
            if(names[i].equalsIgnoreCase(search) && pword[i].equalsIgnoreCase(searchP))
            {
                System.out.println("Welcome, " + names[i]);
                break;
            }

            if(names[i].equalsIgnoreCase(search) != pword[i].equalsIgnoreCase(searchP))
            {
                System.out.print("Account Not Found!");
                break;
            }
        }
    }
}
