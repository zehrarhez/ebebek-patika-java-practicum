import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if ((i % 4 == 0) & (i % 5 == 0)) {
                System.out.println(i);
            }

        }
    }
}
