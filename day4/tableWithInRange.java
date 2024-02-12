package day4;

public class tableWithInRange {
    public static void main(String[] args) {
        int num;
        int i;

        for (num = 3; num <= 7; num++)

        {
            for (i = 1; i <= 10; i++) {
                System.out.print(num * i + "  ");
            }
            System.out.print("\n");
        }

    }
}
