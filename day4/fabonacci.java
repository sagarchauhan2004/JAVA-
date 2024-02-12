package day4;

import java.util.*;

// a b c
// 0 1 1 2 3 5 8 13 21 ...............
//   a b
public class fabonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of iteration  :  ");

        int n = obj.nextInt();
        int a = 0;
        int b = 1;
        int i;
        System.out.print(a + "  " + b + "  ");
        for (i = 0; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(+c + " ");
            a = b;
            b = c;
            obj.close();
        }
    }
}
