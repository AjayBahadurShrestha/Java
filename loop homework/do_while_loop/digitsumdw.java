import java.util.Scanner;

public class digitsumdw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number != 0);

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
