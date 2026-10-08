import java.util.Scanner;

public class sumtondw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        int total = 0;
        int i = 1;
        do {
            total = total + i;
            i++;
        } while (i <= n);
        System.out.println("total: " + total);
    }
}
