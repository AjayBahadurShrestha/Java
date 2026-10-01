import java.io.*;

class BufferedReaderExample3 {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int b = Integer.parseInt(br.readLine());
		
		System.out.print("Enter second number: ");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Sum of 3 integer = " + (a + b + c));
    }
}
