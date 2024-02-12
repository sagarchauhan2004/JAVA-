package day7;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the row and column  : ");
        int r = obj.nextInt();
        int c = obj.nextInt();
        //
        int arr[][] = new int[r][c];

        System.out.println("enter the element : ");
        int i, j;
        for (i = 0; i < r; i++) // row
        {

            for (j = 0; j < c; j++) // column
            {
                arr[i][j] = obj.nextInt();
            }
        }
        int sum = 0;
        System.out.println("after insertion : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("aapka sum  : " + sum);
    }
}
