package day8;

public class factorial {
    int fun(int num) {
        int i, f = 1;
        for (i = num; i > 0; i--) {
            f = f * i;

        }
        return f;
    }

    public static void main(String[] args) {
        factorial obj = new factorial();
        int i;
        float sum = 0;
        for (i = 1; i <= 5; i++)

        {
            int ans = obj.fun(i);
            sum = sum + (float) i / ans;
            System.out.println("answer : " + ans);
        }
        System.out.println("sum = " + sum);

    }
}
