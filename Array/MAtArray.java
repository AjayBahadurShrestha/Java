// WAP to find addition of 2 array of order 2 by 3
import java.util.Scanner;

class MAtArray {
    public static void main(String args[]) {
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];
        int c[][] = new int[2][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st array elements of order 2*3: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd array elements of order 2*3: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition of arrays
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of array elements are: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
