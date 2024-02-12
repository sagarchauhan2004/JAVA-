package day4;

public class counting_of_primeNumber {
    public static void main(String[] args) {
        int num = 50;
        int i;
        int g = 0;
        for (num = 50; num <= 100; num++) {
            int c = 0;
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c++;
                }
            }
            if (c == 2)

            {
                System.out.println("prime hai" + num);
                g++;
            }
        }
        {
            System.out.println("total :" + g);
        }

    }
}
