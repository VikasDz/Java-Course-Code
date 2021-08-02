package com.CodeWithMe;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Chapter_8_NewJavaClass {
    public static void main(String[] args) {
        System.out.println("This is Custom Class!");
        Employee Satya = new Employee(); // Instantiating a new Employee Object
        Employee Jhon = new Employee(); // Instantiating a new Employee Object


        // Setting Attributes for Satya
        Satya.id = 45;
        Satya.name = "Satyam";
        Satya.salary = 5000;
        Jhon.id = 99 ;
        Jhon.name = "Jhon Sena";
        Jhon.salary = 50000;


        // Printing the Attributes
       //  Satya.printDetails();
      // Jhon.printDetails();
//        Satya.getSalary();
        int salary = Satya.getSalary();
        System.out.println(salary);

//        System.out.println(Satya.id);
//        System.out.println(Satya.name);

    }

}
