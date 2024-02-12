package day3.loop;

public class prime_number {
  public static void main(String[] args) {
    int num = 7;
    int i, c = 0;
    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        c++;
        System.out.println(i);
      }
    }

    System.out.println("total :" + c);
    if (c == 2) {
      System.out.println("prime hai");
    } else {
      System.out.println("not prime");
    }
  }

}
