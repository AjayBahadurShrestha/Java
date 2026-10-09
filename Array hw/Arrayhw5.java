class Arrayhw5 {
    public static void main(String args[]) {

        int[] a = {2, 7, 4, 9, 10, 3, 8};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("The number of even numbers is : " + count);
    }
}