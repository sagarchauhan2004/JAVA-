package day11;

public class test2 {
  void fun(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * 2;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 11, 22, 33, 44 };
    test2 obj = new test2();
    obj.fun(arr);
    System.out.println("after calling  : ");
    int i;
    for (i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

  }
}
