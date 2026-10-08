import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        int rev = 0;
        for (int i = n; i != 0; i = i / 10) {
            rev = rev * 10 + i % 10;
        }
        System.out.println("reversed: " + rev);
    }
}
