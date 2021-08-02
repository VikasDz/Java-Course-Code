package com.CodeWithMe;

abstract class Parent2{
    public  Parent2(){
        System.out.println("Parent2 ka Constructor Hu..");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class Chapter_11_Abstract_Class {
    public static void main(String[] args) {
//        Parent2 p = new Parent2(); -- Error Because We Can't Make Object Of Abstract Class  -------------->
        Child2 c = new Child2();
        c.greet();
        c.greet2();
//        Child3 c3 = new Child3();  --- Error Because Here We Can't Initial Abstract Class Methods ------->
    }
}
