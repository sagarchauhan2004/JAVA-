package day5;

import java.util.Scanner;



public class ArraySum {
    public static void main(String[] args) {
        
    
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the size : ");
    int size = obj.nextInt();
    int arr[] = new int[size];
    System.out.println("enter the element : ");
    int i;
    for( i = 0 ; i < arr.length ; i++)
    {
        arr[i] = obj.nextInt();
    }
    //sum
    int sum = 0;
     for(i = 0 ; i < arr.length ; i++)
     {
        sum = sum + arr[i];
     }
     System.out.println("aaapka sum : " +sum);
    }
   }
