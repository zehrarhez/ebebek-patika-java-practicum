import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i *= 4) {
            System.out.println("Power of 4 : " +i);
        }
        for (int i = 1; i <= num; i *= 5) {
            System.out.println("Power of 5 : " +i);
        }
    }
}
