public class armstrong {
    int digitnikalo(int num) {
        int c = 0;
        while (num > 0) {
            c++;
            num = num / 10;

        }
        return c;

    }

    int poowernikalo(int a, int b) {
        int i, f = 1;
        for (i = 0; i < b; i++) {
            f = a * f;

        }
        return f;
    }

    int fun(int num) {
        int count = digitnikalo(num);
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = sum + poowernikalo(r, count);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 153;
        armstrong obj = new armstrong();
        int ans = obj.fun(num);
        if (ans == num) {
            System.out.println("armstrong  ");
        } else {
            System.out.println("not armstrong ");
        }
    }
}