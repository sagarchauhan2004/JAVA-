package day6;

public class bubblesort {
   public static void main(String[] args) {
      int arr[] = { 8, 4, 9, 6 };

      int i, j;
      for (i = 0; i < arr.length; i++) // number of step
      {
         for (j = 0; j < arr.length - 1; j++) // comparision
         {
            if (arr[j] > arr[j + 1]) {
               int t = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = t;

            }
         }
      }
      System.out.println("after sorting : ");
      for (i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
