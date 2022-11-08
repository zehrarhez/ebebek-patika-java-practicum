import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armutKg = 2.14, armutMiktar;
        double elmaKg = 3.67, elmaMiktar;
        double domatesKg = 1.11, domatesMiktar;
        double muzKg = 0.95, muzMiktar;
        double patlicanKg = 5.00, patlicanMiktar;

        double toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo?");
        armutMiktar = input.nextDouble();

        System.out.println("Elma kaç kilo?");
        elmaMiktar = input.nextDouble();

        System.out.println("Domates kaç kilo?");
        domatesMiktar = input.nextDouble();

        System.out.println("Muz kaç kilo?");
        muzMiktar = input.nextDouble();

        System.out.println("Patlıcan kaç kilo?");
        patlicanMiktar = input.nextDouble();

        toplamTutar = armutMiktar*armutKg + elmaMiktar*elmaKg + domatesMiktar*domatesKg + muzMiktar*muzKg + patlicanMiktar*patlicanKg;

        System.out.println("Toplam tutar = " + toplamTutar + "TL");


    }
}
