import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        long fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial is " + fact);
    }
}
