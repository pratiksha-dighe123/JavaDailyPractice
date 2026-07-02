package com.multithreading;

class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        Mythread t = new Mythread();
        t.start();

        System.out.println("Main thread is running");
    }
}
