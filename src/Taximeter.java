import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args){
        double acilisUcret = 10, toplamMesafe, kmUcret = 2.20, toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz : ");
        toplamMesafe = input.nextDouble();
        toplamTutar = acilisUcret + (toplamMesafe * kmUcret);
        toplamTutar = (toplamTutar >= 20) ? toplamTutar : 20;
        System.out.println("Toplam tutar = " + toplamTutar);


    }
}
