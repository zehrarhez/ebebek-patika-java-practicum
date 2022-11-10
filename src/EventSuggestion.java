import java.util.Scanner;

public class EventSuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        int condition = 0;
        System.out.println("Enter a heat : ");
        heat = input.nextInt();

        if (heat < 5) {
            condition = 1;
        } else if (heat < 15 && heat >= 5) {
            condition = 2;
        } else if (heat >= 15 && heat < 25) {
            condition = 3;
        } else if (heat >= 25) {
            condition = 4;
        }
        switch (condition){
            case 1:
                System.out.println("You can ski.");
                break;
            case 2:
                System.out.println("You can go to cinema.");
                break;
            case 3:
                System.out.println("You can go to picnic.");
                break;
            case 4:
                System.out.println("You can swim.");
                break;
        }
    }
}