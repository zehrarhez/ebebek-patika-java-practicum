import java.util.Scanner;
public class PassOrFailProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik, gecmeNotu = 55;
        int gecerliDersSayisi = 5;


        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        if (mat<0 || mat>100){
            mat = 0;
            gecerliDersSayisi--;
        }
        if (fizik<0 || fizik>100){
            fizik = 0;
            gecerliDersSayisi--;
        }
        if (kimya<0 || kimya>100){
            kimya = 0;
            gecerliDersSayisi--;
        }
        if (turkce<0 || turkce>100){
            turkce = 0;
            gecerliDersSayisi--;
        }
        if (muzik<0 || muzik>100){
            muzik = 0;
            gecerliDersSayisi--;
        }


        double toplamNot = mat + fizik + kimya + turkce + muzik;
        double notOrt = toplamNot / gecerliDersSayisi;
        System.out.println(notOrt);
        String gecmeDurumu;
        gecmeDurumu = (notOrt >= gecmeNotu) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecmeDurumu);

    }
}


