package com.CodeWithMe;

import java.util.Scanner;

public class Chapter_5_DoWhileLoop {
    public static void main(String[] args) {
//        int i =0;
//        do {
//            System.out.println("Hello World");
//            i++;
//        }while (i<5);

        Scanner Number = new Scanner(System.in);
        System.out.println("Enter Number ");
        int Loop = Number.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<=Loop);

    }
}
//Quiz

