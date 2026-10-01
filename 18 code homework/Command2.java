
// product and average of 3 numbers

class Command2 {
    public static void main(String args[]) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int product = a * b * c;
        double average = (a + b + c) / 3.0;

        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}