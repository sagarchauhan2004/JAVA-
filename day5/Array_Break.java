package day5;

public class Array_Break {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 9, 6, 5, 4 };
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        int i, m = 0, n = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[m] = arr[i];

                m++;

            } else {
                odd[n] = arr[i];
                n++;
            }
        }
        System.out.println("odd wale");
        for (i = 0; i < n; i++) {
            System.out.print(odd[i] + " ");

        }
        System.out.println("\n even wale ");
        for (i = 0; i < m; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
