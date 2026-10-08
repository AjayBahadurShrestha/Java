import java.util.Scanner;

public class printnumsdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter last number: ");
        int n = s.nextInt();
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }
}
