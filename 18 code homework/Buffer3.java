// simple interest using buffer reader

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Buffer3 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Enter principal amount: ");
        int p = Integer.parseInt(br.readLine());

        System.out.println("Enter rate of interest: ");
        int r = Integer.parseInt(br.readLine());

        System.out.println("Enter time in years: ");
        int t = Integer.parseInt(br.readLine());

        double si = (p * r * t) / 100.0;

        System.out.println("Simple Interest = " + si);
    }
}