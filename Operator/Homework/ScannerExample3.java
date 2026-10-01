import java.util.Scanner;

class ScannerExample3 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
		
        System.out.print("Enter first number: ");
        int c = sc.nextInt();

       

        System.out.println("Sum of 3 integers = " + (a+b+c));
    }
}
