class loop {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        String[] b = { "Kousalya", "Nanda", "Nandu" };

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (String j : b) {
            System.out.println(j);
        }

        int k = 0;
        while (k < a.length) {
            System.out.println(a[k]);
            k++;
        }

        int n = 0;
        do {
            System.out.println(b[n]);
            n++;
        } while (n < b.length);
    }
}