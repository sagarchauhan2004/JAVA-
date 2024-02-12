package day6;
//Binary search : array must be in sorted order 

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int arr[] = { 11, 22, 33, 44, 55, 66, 77 };
        // 0 1 2 3 4 5 6
        int beg = 0, end = arr.length - 1, mid = (beg + end) / 2;
        System.out.println("enter the element to be searched  : ");
        int item = obj.nextInt();
        int c = 0;
        while (beg <= end) // big - 0 end - 6 mid = 3

        {
            if (item == arr[mid]) {
                c++;
                System.out.println("item found ");

                break;
            }
            if (item > arr[mid]) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (beg + end) / 2;

        }
        if (c == 0) {
            System.out.println("not found ");
        }

    }
}
