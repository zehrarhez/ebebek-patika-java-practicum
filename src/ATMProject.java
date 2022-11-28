import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.println("Enter your username :");
            userName = input.nextLine();
            System.out.println("Enter your password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome Kodluyoruz Bank!");

                System.out.println("1-Deposit\n" +
                        "2-Withdraw\n" +
                        "3-Balance Inquiry\n" +
                        "4-Log Out");
                System.out.print("Please choose the operation you want to do : ");
                select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Money amount : ");
                        int amount = input.nextInt();
                        balance += amount;
                        break;
                    case 2:
                        System.out.print("Money amount : ");
                        amount = input.nextInt();
                        if (amount > balance) {
                            System.out.println("Sufficient balance.");
                        } else {
                            balance -= amount;
                        }
                        break;
                    case 3:
                        System.out.println("Balance : " + balance);
                        break;
                    case 4:
                        System.out.println("See you later again!");
                        System.exit(0);
                        break;
                }

            }else{
                right--;
            System.out.println("Wrong username and password. Try again!");
            if (right == 0) {
                System.out.println("Your account has been blocked. Please call the bank!");
            } else {
                System.out.println("Remind right : " + right);
            }
            }
        }
    }
}

