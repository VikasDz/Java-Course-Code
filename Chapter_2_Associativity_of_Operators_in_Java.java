package com.CodeWithMe;

public class Chapter_2_Associativity_of_Operators_in_Java{
    public static void main(String[] args) {
        int a = 5*6-45/2;
        System.out.println(a);
        //Associativity of Operators in Java
        //There Lefty To Right Goes

        //Precedence of Operators in Java
        // * / %
        // + -
        // =
        // Here Top to Bottom Go
        int b = (4-2)/2;
        int c = 4*4 - (4*5*6) / (2*5);
        System.out.println(c);
        System.out.println(b);
    }
}
