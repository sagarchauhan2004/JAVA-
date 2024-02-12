public class instance2 {
   int a;

   void fun() {
      a = 10;

   }

   void show() {
      System.out.println("a = " + a);

   }

   public static void main(String[] args) {
      instance2 obj = new instance2();
      obj.fun();
      obj.show();
   }
}
