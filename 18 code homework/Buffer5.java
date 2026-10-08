// even and odd 

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Buffer5 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}