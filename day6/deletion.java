package day6;

import java.util.Scanner;

// 11  22  33  44  55             pos = 1
//  0   1   2   3   4
public class deletion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size  : ");
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element : ");
        int i;
        for (i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("enter the position to be deleted  : ");
        int pos = obj.nextInt();

        // 11 22 33 44 55 pos = 1
        // 0 1 2 3 4
        // i i+1
        if (pos < arr.length) {
            for (i = pos; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("after deletion :");
            for (i = 0; i < arr.length - 1; i++)

            {
                System.out.println(arr[i] + " ");
            }
        } else {
            System.out.println("bhai out of bound : ");
        }

    }
}
