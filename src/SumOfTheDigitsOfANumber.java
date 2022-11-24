import java.util.Scanner;

public class SumOfTheDigitsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,remainder, sum = 0;
        System.out.println("Enter a number : ");
        number = input.nextInt();

        while(number != 0){
            remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        System.out.println("Sum : "+sum);



    }
}
