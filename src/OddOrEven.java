import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int number;
        double avarage;
        int totalOfNumbers = 0, numberOfNumbers = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        for (int i = 0; i <= number; i++)  {
            if ((i % 3 == 0) && (i % 4 == 0)){

                totalOfNumbers += i;

                numberOfNumbers++;
                System.out.print("i : " + i + " so the");
                System.out.println(" total of numbers : " + totalOfNumbers);
            }
        }
        avarage = totalOfNumbers / numberOfNumbers;
        System.out.println("---");
        System.out.println("Avarage of the numbers : " +avarage);

    }
}
