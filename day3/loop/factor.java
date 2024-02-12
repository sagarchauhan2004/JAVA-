package day3.loop;

public class factor {
  public static void main(String[] args) {
    int num = 50;
    int i;

    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.println(i);
      }
    }
  }
}
