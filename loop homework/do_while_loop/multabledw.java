import java.util.Scanner;

public class multabledw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        int i = 1;
        do {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        } while (i <= 10);
    }
}
