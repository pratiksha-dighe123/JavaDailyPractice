package com.multithreading;

class Demo extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {

            System.out.println(getName()+" :"+i);

        }
    }
}

public class MultipleThread {
    public static void main(String[] args) {

        Demo t1=new Demo();

        Demo t2=new Demo();

        t1.start();

        t2.start();

    }
}