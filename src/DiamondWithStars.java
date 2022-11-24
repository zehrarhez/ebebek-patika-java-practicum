import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of stars in the middle of the diamond : ");
        number = input.nextInt();
        number = (number - 1) / 2;

        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for (int i = number; i >= 0; i--){
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
