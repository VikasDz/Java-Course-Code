package com.CodeWithMe;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
        }
    }
}
public class Chapter_13_Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
//        t5.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        //Check Out Documentation Of Thread Priorities---------
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
