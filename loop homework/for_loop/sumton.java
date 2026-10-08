import java.util.Scanner;

public class sumton {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        System.out.println("total: " + total);
    }
}
