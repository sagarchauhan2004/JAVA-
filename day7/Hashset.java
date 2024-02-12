package day7;

import java.util.Arrays;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        Integer arr[] = { 4, 8, 9, 2, 9 };
        TreeSet<Integer> obj = new TreeSet<>(Arrays.asList(arr));
        System.out.println(obj);
    }
}
