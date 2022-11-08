import java.util.Objects;
import java.util.Scanner;

public class UserLogIn {
    public static void main(String[] args) {
        String userName, password, savedUserName, savedPassword, newPassword, wrongPassword = null;
        boolean userNameCorrectness = true, passwordCorrectness = true;
        int reset;


        Scanner input = new Scanner(System.in);

        System.out.println("- SIGN UP -");
        System.out.print("Define an username : ");
        savedUserName = input.nextLine();
        System.out.print("Define a password : ");
        savedPassword = input.nextLine();
        System.out.println("You signed up to the site." + "\nYou are directing the logging in page..." + "\n");

        while(true) {
            System.out.println("- LOG IN -");
            System.out.print("Enter your username : ");
            userName = input.nextLine();
            System.out.print("Enter your password : ");
            password = input.nextLine();


            if (userName.equals(savedUserName)) {
                userNameCorrectness = true;
            } else {
                userNameCorrectness = false;
            }
            if (password.equals(savedPassword)) {
                passwordCorrectness = true;
            } else {
                wrongPassword = password;
                passwordCorrectness = false;
            }

            if (userNameCorrectness && passwordCorrectness) {
                System.out.println("You logged in the site, successfully");
                break;
            } else if (userNameCorrectness == false && passwordCorrectness == false) {
                System.out.println("Check your informations! ");
            } else if (userNameCorrectness == false && passwordCorrectness) {
                System.out.println("Check your username!");
            } else if (userNameCorrectness && passwordCorrectness == false) {
                System.out.println("Check your password!");
                System.out.println("Do you want to reset your password? 1- Yes / 2- No");
                reset = input.nextInt();
                input.nextLine();
                if (reset == 1) {
                    System.out.println("Enter your new password : ");
                    newPassword = input.nextLine();

                    while (Objects.equals(newPassword, savedPassword) || Objects.equals(newPassword, wrongPassword)) {
                        System.out.println("This password has been used before, please enter a different password! ");
                        newPassword = input.nextLine();
                    }
                    savedPassword = newPassword;
                    System.out.println("Password updated!");
                    System.out.println(newPassword);
                } else if (reset == 2) {
                    System.out.println("Check your informations and try again!");
                }

            }
        }
    }












}
