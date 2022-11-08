import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        double height;
        double weight;
        double index;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meters. ");
        height = input.nextDouble();
        System.out.println("Please enter your weight. ");
        weight = input.nextDouble();

        index = weight/(height*height);

        System.out.println("Your body-mass index is " + index);
        if(index < 18.5){
            System.out.println("Your body is weak.");
        }else if (index <= 24.9 && index >= 18.5){
            System.out.println("Your body is normal");
        } else if (index < 29.9 && index >= 25) {
            System.out.println("Your body is fat.");
        }else if (index <= 34.9 && index >= 30){
            System.out.println("Your body is obese.");
        }else if (index >=35){
            System.out.println(("Your body is over-obese."));
        }
    }
}
