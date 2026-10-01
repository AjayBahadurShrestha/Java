// marks percentage and average of three subjects


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Buffer2 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Enter English marks: ");
        int english = Integer.parseInt(br.readLine());

        System.out.println("Enter Math marks: ");
        int math = Integer.parseInt(br.readLine());

        System.out.println("Enter Computer marks: ");
        int computer = Integer.parseInt(br.readLine());

        int total = english + math + computer;
        double percentage = (total / 300.0) * 100;
        double average = total / 3.0;

        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Average = " + average);
    }
}