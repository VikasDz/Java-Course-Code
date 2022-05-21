package com.CodeWithMe;

import java.util.Scanner;

public class Practice_Set_01 {
    public static void main(String[] args) {



//       1. Write a program to sum three numbers in Java.
//       2. Write a program to calculate CGPA using marks of three subjects (out of 100)
//       3. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
//       4. Write a Java program to convert Kilometers to miles.
//       5.Write a Java program to detect whether a number entered by the user is an integer or not.


//        Question - 1
//        int a = 54;
//        int b = 89;
//        int c =45;
//        int d = a+b+c;
//        System.out.println("The Sum is ");
//        System.out.print(d);

//        Question - 2
//        Scanner AllMarks = new Scanner(System.in);
//        System.out.println("Enter Your Science Marks ");
//        int Marks1 = AllMarks.nextInt();
//        System.out.println("Enter Your Sst Marks ");
//        int Marks2 = AllMarks.nextInt();
//        System.out.println("Enter Your Math Marks ");
//        int Marks3 = AllMarks.nextInt();
//        System.out.println("Enter Your Hindi Marks ");
//        int Marks4 = AllMarks.nextInt();
//        System.out.println("Enter Your English Marks ");
//        int Marks5 = AllMarks.nextInt();
//        int total = Marks1+Marks2+Marks3+Marks4+Marks5;
//        float CGPA = ((total*100)/500);
//        System.out.print("Your CGPA is\t");
//        System.out.print(CGPA);

//        Question - 3

        Scanner name = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String Name = name.next();
        System.out.print("Hello " );
        System.out.print(Name );
        System.out.print(" Have a Gud Day");

//        Question - 4
//        Scanner Kilometer = new Scanner(System.in);
//        System.out.println("Enter Your Kilometer ");
//        float KiloMeter = Kilometer.nextInt();
//        float d = KiloMeter/1.609f;
//        System.out.print("The Value in Meter is ");
//        System.out.println(d);

//         Question - 5
        System.out.println("Enter Your Number ");
        Scanner Num = new Scanner(System.in);
        System.out.print(Num.hasNextInt());



    }
}

