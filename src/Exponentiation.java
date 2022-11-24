import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,result = 1;
        System.out.println("Enter the base : ");
        x = input.nextInt();
        System.out.println("Enter the power : ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++){
            result *= x;
        }
        System.out.println("Result : " +result);

    }
}
