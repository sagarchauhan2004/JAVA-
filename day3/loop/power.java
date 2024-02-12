package day3.loop;

public class power {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int i, f = 1;

        for (i = 0; i < b; i++) {
            f = a * f;
        }
        System.out.println("f=" + f);

    }
}
