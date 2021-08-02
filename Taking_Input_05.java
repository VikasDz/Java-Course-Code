package com.CodeWithMe;

import java.util.Scanner;

public class Taking_Input_05 {
    public static void main(String[] args) {
        Scanner AllMarks = new Scanner(System.in);
        System.out.println("Enter Your Science Marks ");
        int Marks1 = AllMarks.nextInt();
        System.out.println("Enter Your Sst Marks ");
        int Marks2 = AllMarks.nextInt();
        System.out.println("Enter Your Math Marks ");
        int Marks3 = AllMarks.nextInt();
        System.out.println("Enter Your Hindi Marks ");
        int Marks4 = AllMarks.nextInt();
        System.out.println("Enter Your English Marks ");
        int Marks5 = AllMarks.nextInt();
        int total = Marks1+Marks2+Marks3+Marks4+Marks5;
        float per = ((total*100)/500);
        System.out.print("Your Percentage is\t");
        System.out.print(per);
        System.out.print("%");
    }
}
