package day5;

import java.util.Scanner;

public class Linear_example {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter the size  : ");
        int size = obj.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the element  : ");
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("enter the element to be searched  :");
        int item = obj.nextInt();
        int c = 0;
        for (i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                System.out.println("mil aya");
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("not found");
        }
    }
}
