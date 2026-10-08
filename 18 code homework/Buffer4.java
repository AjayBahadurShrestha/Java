// smallest and largest number among the input 3 numbers

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Buffer4 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter second number: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter third number: ");
        int c = Integer.parseInt(br.readLine());

        int largest;
        int smallest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}