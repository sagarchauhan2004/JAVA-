//float : 4 byte
//int : 4 byte
//double : 8 byte

package day4;

public class armstrong_new {
    public static void main(String[] args) {
        int num = 153;
        int c = 0;
        int t = num;
        while (num > 0) {
            c++;
            num = num / 10;

        }
        System.out.println("total : " + c);
        num = t;
        System.out.println("num = " + num);
        int sum = 0;
        while (num > 0)

        {
            int r = num % 10;
            sum = sum + (int) Math.pow(r, c);
            num = num / 10;

        }
        if (t == sum) {
            System.out.println("armstrong");

        } else {
            System.out.println("not an armstrong number");
        }

    }
}
