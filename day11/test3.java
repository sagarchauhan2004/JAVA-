package day11;

class BB {
  private int a;
  public int b;

  void fun() {
    a = 10;
    b = 20;
  }

  public int getA() {
    return a;
  }
}

class CC extends BB {
  private int c;

  void multiply() {
    c = getA() * b;
  }

  void show() {
    System.out.println("a = " + getA());
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }
}

public class test3 extends CC {
  public static void main(String[] args) {
    CC obj = new CC();
    obj.fun();
    obj.multiply();
    obj.show();
    obj.b = 40;
    obj.multiply();
    obj.show();

  }

}
