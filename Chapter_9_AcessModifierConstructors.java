package com.CodeWithMe;
class MyEmplooye{
    private int id;
    private String name;

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
public class Chapter_9_AcessModifierConstructors {
    public static void main(String[] args) {
        MyEmplooye Satya = new MyEmplooye();


//        Satya.id = 55;---------------------> Produce An Error Because of Private Class.
//        Satya.name = "Vikas";--------------------> Produce An Error Because of Private Class..
        Satya.Setname("Satyam");
        Satya.Setid(58);
        System.out.println(Satya.getName());
        System.out.println(Satya.getId());
        System.out.println(Satya.getClass());
    }
}
