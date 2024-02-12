package day3.loop;

// 5! = 5 * 4 * 3 * 2 * 1

public class factorial {
    public static void main(String[] args) {
        int i, f = 1;
        int num = 5;
        for (i = 1; i <= num; i++) {
            f = i * f;

        }

        System.out.println("f = " + f);

    }
}