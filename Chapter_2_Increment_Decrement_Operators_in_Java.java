package com.CodeWithMe;

public class Chapter_2_Increment_Decrement_Operators_in_Java {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        ++a; //This is Known as Increment Operators.
        a++;
        System.out.println(a);
        int j = 58;
        System.out.println(j);
        --j;
        j--;  //This is Known as Decrement Operators.
        System.out.println(j);
        --j;
        System.out.println(j);


        //Quick Quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char f = 'b';
        f++;
        System.out.println(f);
    }
}
