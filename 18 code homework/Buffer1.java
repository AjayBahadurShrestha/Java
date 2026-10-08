// sum product and average of the input three numbers

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Buffer1 {
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

        System.out.println("Sum = " + (a + b + c));
        System.out.println("Product = " + (a * b * c));
        System.out.println("Average = " + ((a + b + c) / 3.0));
    }
}