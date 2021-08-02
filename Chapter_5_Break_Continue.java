package com.CodeWithMe;

public class Chapter_5_Break_Continue {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            System.out.println(i);
            System.out.println("Java is Great");
            if(i==2){
                System.out.println("Ending The Loop") ;
                break;
            }
        }
//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;

        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while(i<5);
        System.out.println("Loops Ends");
    }
    }