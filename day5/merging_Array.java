package day5;

public class merging_Array {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 6 };
        int brr[] = { 3, 7, 9, };
        int crr[] = new int[arr.length + brr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }
        for (i = 0; i < brr.length; i++) {
            crr[i + arr.length] = brr[i];

        }
        System.out.println("merge array");
        for (i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + "  ");
        }
    }
}
