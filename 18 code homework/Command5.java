// even and odd number


class Command5 {
    public static void main(String args[]) {

        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}