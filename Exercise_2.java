package com.CodeWithMe;

import java.util.Random;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 For Rock , 1 For Paper , 2 For Scissor\n");
        int userInput = sc.nextInt();

        Random random = new Random();
        int comp = random.nextInt(3);

        if(userInput== comp){
            System.out.println("Draw");
        }
        else if (userInput == 0 && comp == 2 || userInput == 1 && comp == 0 || userInput==2 && comp==1){
            System.out.println("You Win!!");
        }
        else {
            System.out.println("Computer Win!!");
        }
        System.out.println("Computer Choice: " +comp);
    }
}
