package day13_String;

public class test11 {
  boolean fun(String ip) {
    String arr[] = ip.split("[.]");
    if (arr.length != 4) {
      return false;
    }
    int i;
    for (i = 0; i < arr.length; i++) {
      String s = arr[i];
      int num = Integer.parseInt(s);
      if (num < 0 || num > 255) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String ip = "5.80.90.67";
    test11 obj = new test11();
    boolean ans = obj.fun(ip);
    if (ans == true) {
      System.out.println("valid");
    }

    else {
      System.out.println("not valid");
    }
  }
}
