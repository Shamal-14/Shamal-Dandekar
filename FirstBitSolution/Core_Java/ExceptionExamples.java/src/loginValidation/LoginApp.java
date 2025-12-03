package loginValidation;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        try {
            
            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            login.validateUsername(user);  

            
            int attempts = 3;
            while (attempts > 0) {
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                try {
                    login.validatePassword(pass); 
                    System.out.println("Login Successful!");
                    return;
                } catch (InvalidPasswordException e) {
                    attempts--;
                    if (attempts > 0) {
                        System.out.println(e.getMessage() + " Attempts left: " + attempts);
                    } else {
                        System.out.println("Account Locked!");
                    }
                }
            }

        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
