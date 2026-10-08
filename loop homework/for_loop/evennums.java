import java.util.Scanner;

public class evennums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter last number: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
