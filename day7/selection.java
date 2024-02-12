package day7;

public class selection {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 3, 1, 9, 2 };
        // 0 1 2 3 4 5
        // min
        // j
        int i, j;
        for (i = 0; i < arr.length; i++) {
            int min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            if (i != min) {
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
        System.out.println("after sorting : ");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}