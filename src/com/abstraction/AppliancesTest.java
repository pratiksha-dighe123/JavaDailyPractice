package com.abstraction;

abstract class Appliance{
    abstract void turnOn();

    public void plugin(){
        System.out.println("Appliance plugged in...");
    }
}

class Fan extends Appliance{
    void turnOn(){
        System.out.println("Fan is turned on");
    }
}

class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("Washing Machine is turned on");
    }
}

public class AppliancesTest {
    public static void main(String[] args) {
        Appliance a1= new Fan();
        a1.plugin();
        a1.turnOn();
        Appliance a2= new WashingMachine();
        a2.plugin();
        a2.turnOn();
    }
}
