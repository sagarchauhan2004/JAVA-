package day6;

//11 22 33 44 55 
public class rotation2 {
   public static void main(String[] args) {

      int arr[] = { 11, 22, 33, 44, 55 };
      int i;
      int j;
      for (j = 0; j < 3; j++) {
         int t = arr[0];
         for (i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

         }
         arr[arr.length - 1] = t;
      }
      System.err.println("after rotation : ");
      for (i = 0; i < arr.length; i++)

      {
         System.out.print(arr[i] + " ");
      }
   }
}
