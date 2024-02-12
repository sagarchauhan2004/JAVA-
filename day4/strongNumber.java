package day4;

// 145  : 1!  +  4!  + 5!  : 1 + 24 + 120  : 145  
public class strongNumber {
    public static void main(String[] args) {
        int num = 145;
        int t = num;
        int i, sum = 0;
        while (num > 0) {
            int f = 1;
            int r = num % 10;

            for (i = r; i > 0; i--) {
                f = f * i;

            }
            // System.out.println(+f);
            sum = sum + f;
            num = num / 10;

        }
        if (t == sum) {
            System.out.println("strong");
        } else {
            System.out.println("not strong");
        }

    }
}
