package day4;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int num = 1234;
        int last = num % 10;
        System.out.println("The last digit is " + last);

        while (num >= 10)

        {
            num = num / 10;
        }
        int first = num;

        System.out.println("the first digit is " + first);

    }
}
