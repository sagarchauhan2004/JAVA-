import day8.factorial;

public class test2 {
    int factorial(int r) {

        // factorial ka code lagega

        int i, f = 1;
        for (i = r; i > 0; i--) {
            f = f * i;
        }

        return f;
    }

    int fun(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            int f = factorial(r);
            sum = sum + f;
            num = num / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 145;
        test2 obj = new test2();
        int ans = obj.fun(num);
        if (ans == num) {
            System.out.println("strong");
        } else {
            System.out.println("not strong");
        }
    }
}
