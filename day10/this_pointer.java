public class this_pointer {
    // this pointer : it pointer to current class element .
    // it is use to differentiate local to instance variable .
    int a;

    void fun(int a) {
        this.a = a;

    }

    void show() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        this_pointer obj = new this_pointer();
        obj.fun(90);
        obj.show();
    }
}
