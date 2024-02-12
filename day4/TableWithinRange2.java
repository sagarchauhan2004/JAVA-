package day4;

import java.util.Scanner;

public class TableWithinRange2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the startig point");
        int start = obj.nextInt();
        System.out.println("enter the ending point");
        int end = obj.nextInt();
        int num, i;
        for (num = start; num <= end; num++) {
            for (i = 1; i <= 10; i++)

            {
                System.out.print(num * i + " ");

            }
            System.out.print("\n");
        }

    }
}
