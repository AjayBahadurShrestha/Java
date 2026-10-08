import java.util.Scanner;

public class div3countdw {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        int count = 0;
        int i = 1;
        do {
            if (n >= 1 && i % 3 == 0) {
                count++;
            }
            i++;
        } while (i <= n);
        System.out.println("numbers divisible by 3: " + count);
    }
}
