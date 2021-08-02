package com.CodeWithMe;

public class Chapter_7_VarArgs {
    /*
    static int sum(int a, int b ){
        return a+b;
    }
    static int sum(int a, int b, int c ){
        return a+b+c;
    }
    To OverCame This Problem VarArgs Introducing For We Pack all Arguments in Array and Sum This Check outs Notes Care Fully!!
     */
    static int sum(int x,int ...arr){
        //Available as int [] arr;
        int result = x;
        for (int a:arr) {
            result += a;
          }
        return result;
    }
    public static void main(String[] args){
        System.out.println("<--------Welcome To VarArgs Tut------->");
        System.out.println("The Sum of Nothing is : "+sum(0));
        System.out.println("The Sum of A and B is : "+sum(85,10));
        System.out.println("The Sum of A, B and C is : "+sum(85,10,5));
        System.out.println("The Sum of A and B is : "+sum(85,10,58,89,56,85555555,656));
    }
}
