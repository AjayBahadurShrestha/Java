import java.util.Scanner;

public class primecheckdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        boolean isPrime = true;
        int i = 2;
        if (n < 2) {
            isPrime = false;
        }
        do {
            if (n % i == 0 && i != n) {
                isPrime = false;
            }
            i++;
        } while (i < n);
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
