package day13_String;

public class test1 {
    String fun(String str) {
        String g = "";
        int i;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                g = g + ch;
            }

        }
        return g;
    }

    public static void main(String[] args) {
        String str = "hello";
        test1 obj = new test1();
        String ans = obj.fun(str);
        System.out.println(ans);
    }
}
