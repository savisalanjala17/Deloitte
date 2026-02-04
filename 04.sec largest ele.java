class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.print(-1);
        } else {
            System.out.print(second);
        }
    }
}
