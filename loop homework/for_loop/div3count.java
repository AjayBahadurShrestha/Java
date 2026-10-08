import java.util.Scanner;

public class div3count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("numbers divisible by 3: " + count);
    }
}
