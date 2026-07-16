package com.multithreading;

class Demo1 extends Thread{

    public void run(){

        try{

            for(int i=1;i<=5;i++){

                System.out.println(i);

                Thread.sleep(1000);

            }

        }

        catch(Exception e){

            System.out.println(e);

        }

    }

}

public class ThreadSleep{

    public static void main(String[] args){

        Demo t1=new Demo();

        t1.start();

    }

}