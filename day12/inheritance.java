package day12;

abstract class bank {
  int amt;

  void deposite() {
  }

  void withdrawl() {
  }

  void display() {
  }

  abstract void intrest();
}

class sagarbank extends bank {
  void intrest() {
    System.out.println("7 up");
  }
}

public class inheritance {
  public static void main(String[] args) {
    sagarbank obj = new sagarbank();
    obj.intrest();
  }
}
