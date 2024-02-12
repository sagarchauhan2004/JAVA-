package day3.loop;

public class reverse {
    public static void main(String[] args) {

        /*
         * int num = 1234;
         * int r = num % 10; //10 se mod karne se last digit milta hai
         * System.out.print(r);
         * 
         * num = num/10; //10 se deivide karne se number chota ho jata hai
         * // ln means (next line)
         * r = num % 10;
         * System.out.print(r);
         * num = num/10;
         * 
         * r = num % 10;
         * System.out.print(r);
         * num = num/10;
         * 
         * r = num % 10;
         * System.out.print(r);
         * num = num/10;
         */

        int num = 121;
        int t = num;
        int sum = 0;
        while (num > 0) // jab tak number 0 se bada hai
        {
            int r = num % 10; // 10 se mod karne pe last digit milta hai
            sum = sum * 10 + r; // number system

            num = num / 10; // 10 se devide karne pe number chota ho jata hai
        }
        System.out.println("Reverse of the given number is: " + sum);
        System.out.println("num =" + sum);

        if (t == sum) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }

}
