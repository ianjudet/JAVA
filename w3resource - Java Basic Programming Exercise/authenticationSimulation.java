import java.util.Scanner;

public class authenticationSimulation 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String names[] = {"Dylan", "Father", "Vincent"};

        String pword[] = {"Taiwan", "Adamson", "University"};

        System.out.print("Username: " );
        String search = s.nextLine();

        System.out.print("Password: ");
        String searchP = s.nextLine();

        
        for(int i = 0; i <= names.length && i <= pword.length; i++)
        {
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
