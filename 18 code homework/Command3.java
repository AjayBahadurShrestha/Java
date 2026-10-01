// Simple interest from command line 


class Command3 {
    public static void main(String args[]) {

        int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);

        double si = (p * r * t) / 100.0;

        System.out.println("Principal = " + p);
        System.out.println("Rate = " + r);
        System.out.println("Time = " + t);
        System.out.println("Simple Interest = " + si);
    }
}