import java.util.Scanner;

public class SortingTheNumbers {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = input.nextInt();
        System.out.println("Enter the second number : ");
        b = input.nextInt();
        System.out.println("Enter the third number : ");
        c = input.nextInt();

        System.out.print("Numbers from small to large : ");
        if (a < b && b < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }if (b < a && b < c){
            if (a < c){
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        }if (c < a && c < b){
            if (a < b){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }

    }
}