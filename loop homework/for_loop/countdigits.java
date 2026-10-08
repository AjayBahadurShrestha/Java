import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        if (n < 0) {
            n = -n;
        }
        int count = 0;
        if (n == 0) {
            count = 1;
        }
        for (int i = n; i > 0; i = i / 10) {
            count++;
        }
        System.out.println("digits: " + count);
    }
}
