package day3.loop;
//153   :   1 ka cube + 5 ka cube + 3 k cube     : 1 + 125 + 27   : 153

public class armstrong {

    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int t = num;
        while (num > 0) {
            int r = num % 10;
            sum = sum + r * r * r ;
            num = num / 10;
        }
        if (t == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

}
