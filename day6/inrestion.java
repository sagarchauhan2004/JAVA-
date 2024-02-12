package day6;

import java.util.Scanner;

public class inrestion {
    // 11 22 33 44 55 item = 88 pos = 1

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size :");
        int size = obj.nextInt();
        int arr[] = new int[size + 1];
        int i;
        System.out.println("enter the element :");
        for (i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("enter the element to be inserted : ");
        int item = obj.nextInt();
        System.out.println("enter the position  :");
        int pos = obj.nextInt();
        pos--;
        // 11 22 33 44 55 - item = 88 pos =1
        // 0 1 2 3 4 5
        // i-1 i
        for (i = size; i > pos; i--) {
            arr[i] = arr[i - 1];

        }
        arr[pos] = item;
        System.out.println("after insertion : ");
        for (i = 0; i < arr.length; i++)

        {
            System.out.print(arr[i] + " ");
        }

    }
}
