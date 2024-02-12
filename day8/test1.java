package day8;

public class test1

{
  int fun(int a, int b) {
    int i, f = 1;
    for (i = 0; i < b; i++) {
      f = f * a;
    }
    return f;
  }

  public static void main(String[] args) {
    int a = 2, b = 5;
    test1 obj = new test1();
    int ans = obj.fun(a, b);
    System.out.println("ans = " + ans);
  }
}
