import java.util.Scanner;

public class CalculatingTheFlightTicket {
    public static void main(String[] args) {
        int distance, age, tripType;
        double distancePrice = 0.10, totalPrice;
        double ageDiscountRate, ageDiscount = 0, roundTripDiscountRate, roundTripDiscount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance as kilometer : ");
        distance = input.nextInt();
        while (distance <= 0){
            System.out.println("Incorrect entry, please type into a valid value.");
            System.out.print("Enter the distance as kilometer : ");
            distance = input.nextInt();
        }
        System.out.print("Enter your age : ");
        age = input.nextInt();
        while (age <= 0){
            System.out.println("Incorrect entry, please type into a valid value.");
            System.out.print("Enter your age : ");
            age = input.nextInt();
        }
        System.out.println("Enter your trip type (1 -> One way , 2 -> Round Trip");
        tripType = input.nextInt();
        while (tripType < 1 || tripType > 2){
            System.out.println("Incorrect entry, please type into 1 or 2.");
            System.out.println("Enter your trip type (1 -> One way , 2 -> Round Trip");
            tripType = input.nextInt();
        }
        totalPrice = distance * distancePrice;


        if (age <= 12){
            ageDiscountRate = 0.5;
            ageDiscount = totalPrice * ageDiscountRate;
            totalPrice = totalPrice - ageDiscount;
        } else if (age > 12 && age <= 24) {
            ageDiscountRate = 0.1;
            ageDiscount = totalPrice * ageDiscountRate;
            System.out.println(totalPrice);
            totalPrice = totalPrice - ageDiscount;
            System.out.println(totalPrice);
        } else if (age > 65) {
            ageDiscountRate = 0.3;
            ageDiscount = totalPrice * ageDiscountRate;
            totalPrice = totalPrice - ageDiscount;
        }
        if (tripType == 2){
            roundTripDiscountRate = 0.2;
            roundTripDiscount = totalPrice * roundTripDiscountRate;
            totalPrice = (totalPrice - roundTripDiscount) * 2;
        }
        System.out.println("Total price is " + totalPrice + " TL");


    }
}
