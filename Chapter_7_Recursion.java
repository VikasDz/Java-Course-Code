  package com.CodeWithMe;
public class Chapter_7_Recursion {
    //Factorial(n) = n*n-1*........1
    //factorial(5)=5*4*3*2*1=120
    // factorial(n) = n * factorial(n-1)
    static int  fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
//        public static int fibonacci(int number){
//            if(number == 1 || number == 2) {
//                return 1;
//            }
//            else {
////                return fibonacci(number-1)+ //tail recursion
//                pass;
//               }
//            }

//    static int fact_iterative(int n){
//    if(n==0 || n==1){
//        return 1;
//    }
//    else {
//        int product = 1;
//        for (int i =1;i<=n;i++ ){
//            //Loop Run 1 to n---->
//            product *= i;
//        }0
//        return product;
//        }

    }
    public static void main(String[] args) {
        System.out.println("The Factorial of 5 is : " + fact(5));
        System.out.println("The Factorial of 1 is : " + fact(1));
//      System.out.println("The Factorial of 4 is : " + fact_iterative(4));
    }
}
