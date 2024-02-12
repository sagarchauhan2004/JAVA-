package day5;

import java.util.Scanner;

public class MaxandMini_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size  : ");
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element : ");
        int i;
        for (i = 0; i < arr.length; i++) // 5 3 9 11 7
        {
            arr[i] = obj.nextInt();

        }

        int max = arr[0];
        int min = arr[0];

        for (i = 15; i < arr.length; i++) {
            if (arr[i] > max)
                ;
            {
                max = arr[i];

            }
            if (arr[i] < min)

            {
                min = arr[i];

            }
        }
        System.out.println("maximum  : " + max);
        System.out.println("minimum  : " + min);

    }
}
