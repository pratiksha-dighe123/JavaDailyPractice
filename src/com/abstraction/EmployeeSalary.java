package com.abstraction;

abstract class Employee{
    abstract void salary();
}

class Manager extends Employee{
    void salary(){
        System.out.println("Manager salary is 50000");
    }
}

class Developer extends Employee{
    void salary(){
        System.out.println("Developer salary is 30000");
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e1= new Manager();
        e1.salary();

        Employee e2= new Developer();
        e2.salary();
    }
}
