import java.util.Scanner;

public class evennumsdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter last number: ");
        int n = s.nextInt();
        int i = 1;
        do {
            if (i % 2 == 0 && i <= n) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= n);
        System.out.println();
    }
}
