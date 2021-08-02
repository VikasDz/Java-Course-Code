package com.CodeWithMe;

class MyMainEmplooye{

    private int id;
    private String name;
    private Float F;
    //    public MyMainEmplooye(){
//        id = 46;
//        name = "Your-Name-Here";
//    }
    public MyMainEmplooye(String myName, int MyId){
        id = MyId;
        name = myName;                                          //This is Called Constructor Overloading In Java----->
    }
    public MyMainEmplooye(String myName){
        name = myName;
    }
    public MyMainEmplooye(String myName, float f){
        name = myName;
        F = f;
    }

    public String getName(){
        return name;
    }
    public int getId(){    //This is Getter Methods to Retrive Data of Private Class..By Using Methods..
        return id;
    }
    public void Setname(String n){
        name = n;
    }
    public void Setid(int i){    //This is Setter....For Access Private by Using Methods..
        id = i;
    }

}
public class Chapter_9_Constructors {
    public static void main(String[] args) {
        MyMainEmplooye Satya = new MyMainEmplooye("Satyam",45 );
//        Satya.Setname("Satyam");
//        Satya.getName();
        System.out.println(Satya.getId());
        System.out.println(Satya.getName());

    }
}
