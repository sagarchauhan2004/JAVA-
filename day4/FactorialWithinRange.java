package day4;

public class FactorialWithinRange {
    public static void main(String[] args) {
        int num = 5;
        int i;

        for (num = 3; num <= 7; num++) {
            int f = 1;

            for (i = num; i > 0; i--)

            {
                f = f * i;
            }
            System.out.println("f = " + f);
        }
    }
}
