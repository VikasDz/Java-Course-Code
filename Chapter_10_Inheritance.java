package com.CodeWithMe;

class BaseI{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class DerivedI extends BaseI{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Chapter_10_Inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        BaseI b = new BaseI();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        DerivedI d = new DerivedI();
        d.setY(43);
        System.out.println(d.getY());
    }

}
