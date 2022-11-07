import java.util.Scanner;

public class HipotenusProgram {
    public static void main(String[] args){
        //The part which in the comment lines is the code about finding hipotenus of a right triangle
        /*
        double firstEdge, secondEdge, hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.println("First edge = ");
        firstEdge = input.nextDouble();
        System.out.println("Second edge = ");
        secondEdge = input.nextDouble();

        hipotenus = Math.sqrt((firstEdge*firstEdge) + (secondEdge*secondEdge));
        System.out.println(hipotenus);
        */
        double firstEdge, secondEdge, thirdEdge, cevre, alan, u;
        Scanner input = new Scanner(System.in);
        System.out.println("First edge = ");
        firstEdge = input.nextDouble();
        System.out.println("Second edge = ");
        secondEdge = input.nextDouble();
        System.out.println("Third edge = ");
        thirdEdge = input.nextDouble();

        cevre = firstEdge + secondEdge + thirdEdge;
        u = cevre / 2;
        alan = Math.sqrt(u*(u-firstEdge)*(u-secondEdge)*(u-thirdEdge));
        System.out.println("Circumference = " + cevre);
        System.out.println("Area = " + alan);



    }

}
