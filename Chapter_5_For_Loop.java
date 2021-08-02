package com.CodeWithMe;

import java.util.Scanner;

public class Chapter_5_For_Loop {
    public static void main(String[] args) {

        //        for (int i = 1; i<=10; i++){
//            System.out.println(i);
//        }

//        Quiz
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter Number ");
        int Loop = Number.nextInt();
        for (int i = 1; i<=Loop; i++){
            System.out.println(2*i+1);
        }
//        Quiz 2

        Scanner Number2 = new Scanner(System.in);
        System.out.println("Enter Number ");
        int Loop2 = Number2.nextInt();
        for (int i = Loop2; i!=0; i--){
            System.out.println(i);
        }
    }
}
