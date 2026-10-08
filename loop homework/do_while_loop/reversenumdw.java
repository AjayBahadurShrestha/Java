import java.util.Scanner;

public class reversenumdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        int rev = 0;
        do {
            rev = rev * 10 + n % 10;
            n = n / 10;
        } while (n != 0);
        System.out.println("reversed: " + rev);
    }
}
