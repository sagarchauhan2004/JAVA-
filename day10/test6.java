public class test6 {
    test6() {
    }

    test6(double x) {
        System.out.println("hello ");
    }

    test6(int x) {
        System.out.println("hiii ");
    }

    public static void main(String[] args) {
        test6 obj = new test6();
        // test6 obj = new test6(90); : hiii
    }
}
