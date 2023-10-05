import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        // Declare variables
        String username = "user";
        String password = "password";
        int tries = 3;

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Start login loop
        while (tries > 0) {

            // Prompt the user for username and password
            System.out.println("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.println("Enter password: ");
            String inputPassword = "";

            // Print each character of password as * while receiving it
            for (int i = 0; i < password.length(); i++) {
                System.out.print("*");
                inputPassword += scanner.next();
            }

            // Check if the username and password are correct
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                // Login successful
                System.out.println("Login successful!");
                break;
            } else {
                // Login failed
                System.out.println("Login failed!");
                tries--;
            }

            // Display the remaining number of tries
            System.out.println("Remaining tries: " + tries);
        }

        // If the user has used up all their tries, display an error message
        if (tries == 0) {
            System.out.println("You have used up all your tries!");
        }
    }
}