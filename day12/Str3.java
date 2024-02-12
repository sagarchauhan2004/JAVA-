package day12;

public class Str3 {
  String fun(String s) {
    String g = "";
    int i;
    for (i = s.length() - 1; i >= 0; i--) {
      g = g + s.charAt(i);

    }
    return g;
  }

  public static void main(String[] args) {
    String moye = "lassi";
    Str3 obj = new Str3();
    String ans = obj.fun(moye);
    System.out.println(ans);
  }
}
