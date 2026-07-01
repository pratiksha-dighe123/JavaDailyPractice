package com.abstraction;

interface Animal1{
    void eat();
}

interface Pet{
    void play();
}

class Dog1 implements Animal1, Pet{
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void play(){
        System.out.println("Dog is playing ");
    }
}

public class InterfaceDemo{
    public static void main(String[] args) {

        Dog1 d= new Dog1();
        d.eat();
        d.play();
    }
}