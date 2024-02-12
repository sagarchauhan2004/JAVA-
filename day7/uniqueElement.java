package day7;

public class uniqueElement {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 2, 7, 2, 3, 6, 3 };
        int i, j;

        for (i = 0; i < arr.length; i++) {

            int c = 0;
            for (j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    c++;
                }
            }

            if (c == 1) // if( c > 1) : 7 3 2 7 2 3 3
            {
                System.out.println(arr[i]);
            }
        }
    }
}