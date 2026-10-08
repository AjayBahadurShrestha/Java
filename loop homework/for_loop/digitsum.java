import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        if (n < 0) {
            n = -n;
        }
        int total = 0;
        for (int i = n; i > 0; i = i / 10) {
            total = total + i % 10;
        }
        System.out.println("sum of digits: " + total);
    }
}
