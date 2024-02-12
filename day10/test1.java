import java.util.Scanner;

public class test1 {
    int id; // instance variable
    String name;

    void fun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id and name : ");
        id = sc.nextInt();
        name = sc.next();

    }

    void show() {
        System.out.println(id + " \t" + name);
    }

    public static void main(String[] args) {
        test1 obj1 = new test1();
        test1 obj2 = new test1();
        obj1.fun();
        obj1.show();
        obj2.fun();
        obj2.show();
    }
}