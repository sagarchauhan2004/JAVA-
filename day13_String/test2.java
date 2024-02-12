package day13_String;
// 0 - 48

// 1 - 49

// 9 - 57

public class test2 {
    int fun(String str) {
        int i;
        int c = 0;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '1' && ch <= '9') {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String str = "hello@123#56";
        test2 obj = new test2();
        int ans = obj.fun(str);
        System.out.println(ans);
    }
}
