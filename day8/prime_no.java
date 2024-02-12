package day8;

import java.util.Scanner;

public class prime_no

{
  boolean fun(int num)

  {
    int i, c = 0;
    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        c++;
      }
    }
    if (c == 2) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int num = sc.nextInt();
    prime_no obj = new prime_no();
    boolean ans = obj.fun(num);
    if (ans == true) {
      System.out.println("prime");
    } else {
      System.out.println("not prime ");
      ;
    }
    sc.close();
  }
}
