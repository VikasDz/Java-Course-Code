package com.CodeWithMe;

public class Chapter_7_Methods_Overloading {
    static void Wish(){
        System.out.println("Good Morning Sir");
    }

    static void change(int a){
        a = 95;
    }

    static void change2(int[]arr){
        arr[0] = 95;
    }
    /*
    There This is Called Methods Overloading Same Methods name But Different Parameters----->
    Lets Use Our Methods---->
     */
    static void foo(){

    }
    static void foo(int a){
        System.out.println("Hello World "+ a);
    }
    static int foo(int x, int y){
        int z;
        z = x+y;
        return z;
    }
    public static void main(String[] args) {
    /*
    Here We Make Void Function which Doesn't Return Nothing----> So Here We Use Void..
     */
    Wish();

    /*Static Keywords
    Use to Associate a Methods of a Given Class rather Than the Object-----> Static Methods in a class is Shared by all Object....
    Check Out Notes---->
    */

    /*
    Case 1 --> Change the Integer----->
    Here Value of X Can't Change Because it Take Copy of Your Argument and Not Actual Value------>
    */
    int x = 45;
    change(x);
    System.out.println("X After Running "+ x);

    /*
    Case-->2. Change the Arrays
     */
    int [] marks = {98, 45, 79, 99, 80};
    change2(marks);
    System.out.println("The Value of X After Running Change is: "+ marks[0]);

    /*
    Methods Overloading---->
    Two Methods can Have Same Name But Different Parameter.Such Methods are Called Overloading Methods..
    Lets Get Started------> Check Out Methods.
     */
        foo(); //--------This Methods Nothing Do Any Thing...
        foo(85); //-------This Methods Do Something Checks out Static Methods
        System.out.println(foo(85,10));//------This Methods Do Something Checks out Static Methods

    }
}


