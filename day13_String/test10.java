package day13_String;

public class test10 {
    String fun(String str) {
        String g = " ";
        String arr[] = str.split("");
        int i;
        for (i = 0; i < arr.length; i++) {
            String s = arr[i];
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            g = g + last + s.substring(1, s.length() - 1) + first + " ";
        }
        return g.trim();
    }

    public static void main(String[] args) {
        String str = "hello how are you";

        test10 obj = new test10();
        String ans = obj.fun(str);
        System.out.println(ans);
    }
}
