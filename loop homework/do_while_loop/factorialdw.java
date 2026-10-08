import java.util.Scanner;

public class factorialdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        long fact = 1;
        int i = n;
        do {
            fact = fact * i;
            i--;
        } while (i >= 1);
        System.out.println("factorial is " + fact);
    }
}
