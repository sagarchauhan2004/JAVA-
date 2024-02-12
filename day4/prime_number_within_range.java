package day4;

public class prime_number_within_range {
    public static void main(String[] args) {
        int num = 50;
        int i;
        for (num = 50; num <= 100; num++) {
            int c = 0;
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println("prime hai" + num);
            }

        }
    }
}
