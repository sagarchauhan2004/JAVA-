package day5;

public class Rotation_Array {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        int t = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = t;
        System.out.println("after rotation :");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
    }
}
