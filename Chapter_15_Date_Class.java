package com.CodeWithMe;

import java.util.Date;

public class Chapter_15_Date_Class {
    public static void main(String[] args) {
        Date d = new Date();
        Date d2 = new Date(2019,12,12);
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d2);
    }
}
