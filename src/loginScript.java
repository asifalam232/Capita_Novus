import java.util.Scanner;

public class loginScript
{
    public static void main(String[] args)
    {
//        Variables with initial values.
        String username = "Admin";
        String password = "Password!";
//        Keeps track of how many login attempts have been made.
        int attempts = 0;

//        Loops through the attempts.
        while (attempts < 3)
        {
//            Gets input for username.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String otherUsername = scanner.nextLine();
//            Checks if username is empty.
            if (otherUsername.isEmpty())
            {
            System.out.println("Please enter a username.");
            }
            else
            {
                System.out.print("Enter your password: ");
                String otherPassword = scanner.nextLine();
//                Checks if the usernames and passwords match.
                if (username.equals(otherUsername) && password.equals(otherPassword))
                {
//                    if username and password match get out of the while loop.
                    System.out.println("You have been validated");
                    break;
                }
                else
                {
                    System.out.println("Access not authorised. Try again");
//                    increments attempts after each unsuccessful attempt.
                    attempts++;
                }
            }
        }
//        Ban the user after three incorrect attempts.
        if (attempts ==3)
        {
            System.out.println("Three incorrect attempts. You have been banned.");
        }

        }
}
