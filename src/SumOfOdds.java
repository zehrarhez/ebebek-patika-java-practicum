import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while(n % 2 ==0) {
            System.out.print("Enter a number : ");
            n = input.nextInt();
            if(n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println("Total " + sum);


    }
}
