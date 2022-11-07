import java.util.Scanner;

public class KDVAmount {
    public static void main(String[] args) {

        double amount, amountWithKDV, amountKDV, KDVRate = 0.18;
        Scanner input = new Scanner(System.in);


        System.out.println("What is the amount? = ");
        amount = input.nextDouble();

        if((amount <= 1000) && (amount >= 0)){
            KDVRate = 0.18;
        }else
            KDVRate = 0.08;

        amountKDV = amount * KDVRate;
        amountWithKDV = amount + amountKDV;


        System.out.println("Amount without KDV : " + amount);
        System.out.println("KDV Rate : " + KDVRate);
        System.out.println("Amount of KDV : " + amountKDV);
        System.out.println("Amount with KDV : " + amountWithKDV);



    }
}
