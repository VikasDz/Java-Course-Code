package com.CodeWithMe;

public class Practice_Set_05 {
    public static void main(String[] args) {
        //Question No. 1
        /*
        Write a program to print the following pattern
        ****
        ***
        **
        *

        Write a program to sum first n even numbers using a while loop.
        Write a program to print the multiplication table of a given number n.
        Write a program to print a multiplication table of 10 in reverse order.
        Write a program to find factorial of a given number using for loops.
        Repeat problem 5 using a while loop.
        Repeat problem 1 using for/while loop.
        What can be done using one type of loop can also be done using the other two types of loops - True or False.
        Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        A do-while loop is executed:
        At least once

        At least twice

        At most once

        Repeat problem 2 using for loop.

        */
        // Practice Problem 1
        int n = 4;
        for (int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Practice Problem 2
//        int sum=0;
//        int n=4;
//        for(int i=0;i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        // Practice Problem 3
//        int n = 5;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 4
//        int n = 10;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 6
//        int n = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        // 5! = 5*4*3*2*1 = 120
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        // Practice Problem 9
//        int n = 8;
//        int sum = 0;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=1;i<=10;i++){
//            sum += n*i;
//        }
//        System.out.println(sum);



    }
}
