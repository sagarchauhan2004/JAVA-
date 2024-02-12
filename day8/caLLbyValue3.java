package day8;

public class caLLbyValue3 {
    void fun(int x) {
        int i, f = 1;
        for (i = x; i > 0; i--) {
            f = f * i;

        }
        System.out.println("f = " + f);
    }

    public static void main(String[] args) {
        int num = 5;
        caLLbyValue3 obj = new caLLbyValue3();
        obj.fun(num);
    }
}
