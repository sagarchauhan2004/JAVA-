package day5;

import java.util.Scanner;

public class array2 
{

 public static void main(String[] args) 

 {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the size :");
    int size = obj.nextInt();
    int arr[] = new int[size];
    System.out.println("enter the no.  :");

    int i;

    for(i=0   ; i  < arr.length  ;  i++)
    {
        arr[i]= obj.nextInt();
    }
    System.out.println("after insertion:  ");
     
    for(i=0 ; i  <  arr.length  ; i++)
    {
     System.out.println(arr[i]);
    }
  }   
}