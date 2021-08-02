package com.CodeWithMe;

public class Chapter_15_Date_Time {
    public static void main(String[] args) {
//
        System.out.println("Number of Years Since 1 Jan 1970 are : "+System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("Number of Seconds Since 1 Jan 1970 are : "+System.currentTimeMillis()/1000);
        System.out.println("Number of Minutes Since 1 Jan 1970 are : "+System.currentTimeMillis()/1000/3600);
        System.out.println("Number of Hours Since 1 Jan 1970 are : "+System.currentTimeMillis()/1000/3600/24);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
