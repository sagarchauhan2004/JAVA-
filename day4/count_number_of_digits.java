package day4;

public class count_number_of_digits {
    public static void main(String[] args) {
        int num = 1234;
        int gino = 0;
        while (num > 0) {
            gino = gino + 1;
            num = num / 10;
        }
        System.out.println("total: " + gino);
    }
}
