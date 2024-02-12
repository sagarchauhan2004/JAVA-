import java.util.Scanner;

public class instance3 {
    int id;
    String name, schl = "kvs";

    void fun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id and name : ");
        id = sc.nextInt();
        name = sc.next();
    }

    void show() {

        System.out.println(id + " \t " + name + " \t" + schl);
    }

    public static void main(String[] args) {
        instance3 obj1 = new instance3();
        instance3 obj2 = new instance3();
        obj1.fun();
        obj2.fun();

        obj1.show();
        obj2.show();
    }
}
