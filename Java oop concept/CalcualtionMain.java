class Calculation {
    public void wish() {
        System.out.println("Hello, Good Morning...");
    }

    void sum() {
        int a = 10, b = 20;
        int s = a + b; // local variable
        System.out.println("Sum of number: " + s);
    }

    public int average(int a, int b, int c) {
        int A = (a + b + c) / 3;
        return A;
    }
}

class CalculationMain {
    public static void main(String... args) {
        Calculation c1 = new Calculation();
        c1.wish();
        c1.sum();
        System.out.println("Average: " + c1.average(12, 25, 42));
    }
}