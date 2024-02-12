package day12;

// interface contain undefine function .
/*similarity of abstract and interface : we can not create a object of interface and abstract class 
becasue of un define function .        
*/
interface DD {
   void fun(); // by default it is abstract by using interface function .

   default void sun() // in interface by using default it can bs define function .
   {
      System.out.println("oye papa ji");
   }
}

public class Interface implements DD {
   public void fun() {
      System.out.println("ola hu ober");
   }

   public static void main(String[] args) {
      Interface obj = new Interface();
      obj.fun();
      obj.sun();

   }
}
