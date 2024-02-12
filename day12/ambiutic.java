package day12;

interface GG {
  void fun();
}

interface JJ {
  void fun();
}

class LL {
  void fun() {
    System.out.println("maggie ");
  }
}

public class ambiutic extends LL implements GG, JJ {
  public void fun() {
    super.fun();
    System.out.println("pizza ");
  }

  public static void main(String[] args) {
    ambiutic obj = new ambiutic();
    obj.fun();

  }
}
