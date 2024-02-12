package day12;

// poly morphism : same name many forms .
// function overloading    //  function overriding 
class BB // parent of AA
{
  void sun() {
    System.out.println("mountain dew ");
  }
}

class AA extends BB // parent
{
  void fun() {
    System.out.println("marinda ");
  }
}

public class over_ride extends AA // child
{
  void fun() {
    System.out.println("fanta");
    super.fun();
    super.sun();
  }

  public static void main(String[] args) {
    over_ride obj = new over_ride();
    obj.fun();
  }
}
