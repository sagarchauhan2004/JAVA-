package day11;

import java.util.Scanner;

public class operation {
    static void input(student arr[]) {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 0; i < 3; i++) {
            System.out.println("enter the id and name : ");
            int rollno = sc.nextInt();
            String naam = sc.next();
            student obj = new student();
            obj.setId(rollno);
            obj.setName(naam);
            arr[i] = obj;
            // static : function is caledd by using by class name .

        }
    }

    static void display(student arr[]) {
        int i;
        System.out.println("student data : ");
        for (i = 0; i < 3; i++) {
            student obj = arr[i];
            System.out.println(obj.getId() + " \t " + obj.getName());
        }

    }

}
