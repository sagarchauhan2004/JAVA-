package day8;

public class callByValue2 {

    void fun(int x, int y, float z, String str) {
        System.out.println("x = " + x);
        System.out.println(" y = " + y);
        System.out.println("str = " + str);

    }

    public static void main(String[] args) {

        int num = 5;
        callByValue2 obj = new callByValue2();
        obj.fun(num, 9, 2.5f, "hello");

    }
}