package com.CodeWithMe;

import java.util.Scanner;

import static java.lang.System.in;

class game {
    private int n;
    private int numberofguesses;
    boolean isNumbertrue=false;
    public game() {
        System.out.println("Number of guesses = 9 only");
        for (numberofguesses=1; numberofguesses <= 9; numberofguesses++) {
            Scanner obj = new Scanner(in);
            System.out.println("Enter the number");
            int guessnumber = obj.nextInt();
            if (guessnumber > 18) {
                System.out.println("you entered greater number plz try again!");

            }
            else if(guessnumber < 18) {
                System.out.println("you entered lesser number plz try again!");

            }
            else if(guessnumber == 18) {
                isNumbertrue=true;
                System.out.println("you won the match");
                System.out.println(numberofguesses + " number of guesses you hav won the match");
                break;
            }
            System.out.println(9 - numberofguesses + "number of guesses you have left");
            if (numberofguesses > 9) {
                System.out.println("game over");
            }
        }
    }
    public void setnumber(int number) {
        this.n = number;
    }
    public int getnumber() {
        return n;
    }
    public void setnumberofguess(int noofguess) {
        this.numberofguesses = noofguess;
    }
    public int getnumberofguesses() {
        return numberofguesses;
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        game obj = new game();
        obj.setnumber(18);
        obj.setnumberofguess(1);

    }
}
