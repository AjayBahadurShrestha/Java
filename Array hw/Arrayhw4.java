class Arrayhw4 {
    public static void main(String args[]) {

        int[] a = {12, 5, 8, 2, 15};

        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("The smallest number is : " + smallest);
    }
}