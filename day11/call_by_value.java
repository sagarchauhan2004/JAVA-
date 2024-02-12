package day11;

public class call_by_value {
    void fun(int a, int b) {
        int t = a;
        a = b;
        b = t;

    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        call_by_value obj = new call_by_value();
        obj.fun(a, b);
        System.out.println(" a = " + a);
        System.out.println("b = " + b);
    }
}
