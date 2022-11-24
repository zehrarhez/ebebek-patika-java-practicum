import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int r;
        int combination;
        System.out.println("Enter the number of elements in the set : ");
        n = input.nextInt();
        System.out.println("Enter the number of group you want to divide the set : ");
        r = input.nextInt();
        combination = factoriyel(n) / (factoriyel(r) * factoriyel(n-r));
        System.out.println("Combination : " + combination);

    }
    static int factoriyel(int n)
    {
        if(n==0)
            return 1;
        int result = 1;
        for (int i = 2; i <= n; i++)
            result = result * i;
        return result;
    }
}
