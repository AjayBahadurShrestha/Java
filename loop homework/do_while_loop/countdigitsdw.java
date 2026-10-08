import java.util.Scanner;

public class countdigitsdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        if (n < 0) {
            n = -n;
        }
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n > 0);
        System.out.println("digits: " + count);
    }
}
