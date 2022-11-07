import java.util.Scanner;

public class circleAreaAndCircumference {
    public static void main(String[] args){
        double r, pi = 3.14;
        double angle;
        double area, circumference;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        r = input.nextDouble();
        System.out.println("Enter the angle : ");
        angle = input.nextInt();
        angle = (angle > 360) ? (angle - 360) : angle;

        if(angle > 360){
            angle -=360;

        }else if (angle <= 0){
            System.out.println("Enter a positive value : ");
            angle = input.nextInt();
        }

        area = pi * r * r * (angle/360);

        circumference = 2 * pi * r * (angle/360);
        circumference = angle != 360 ? circumference += (2*r) : circumference;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);





    }
}
