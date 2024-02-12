package day8;

public class oopsBasic {

  /*
   * OOPS : object oriented programming system
   * 
   * 1) > class : collection of data member and member function
   * 
   * class bank
   * {
   * 
   * int acno;
   * string cname , adhaar, pan , : // data member
   * float amt ;
   * 
   * deposit(){}
   * withdrawwl(){}
   * display(){}
   * intrest(){}
   * 
   * }
   * 
   * bank obj;
   * obj.deposit();
   * 
   * 
   * 2) > object : run time entity .
   * : its an blueprint of an class once you create a class u can as many as
   * object .
   * 
   */

  void sun() {
    System.out.println("bye");
  }

  void fun() {
    System.out.println("hello");
  }

  public static void main(String[] args) {

    {
      System.out.println("hii");
      oopsBasic obj = new oopsBasic();
      for (int i = 0; i <= 5; i++) {
        obj.fun();
      }
    }
  }
}
