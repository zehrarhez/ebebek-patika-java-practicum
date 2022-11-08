import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int operator;
        System.out.println("What is the first number?");
        num1 = input.nextDouble();
        System.out.println("What is the second number?");
        num2 = input.nextDouble();

        System.out.println("Choose the operation number : " + "\n1- (+)" + "\n2- (-)" + "\n3- (*)" + "\n4- (/)");
        operator = input.nextInt();

        if (operator == 4 && num2 == 0){
            System.out.println("Numbers can not divide 0!");
        }else{
            switch (operator) {
                case 1:
                    System.out.println("Result is " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result is " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result is " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Result is " + (num1 / num2));
                    break;
                default:
                    System.out.println("Enter a valid operator.");
                    break;

            }
        }


    }



}
