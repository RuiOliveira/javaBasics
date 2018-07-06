package com.example.basics.Basics;

public class AustralianTraffic implements Interfaces, InterfacesSecond {

    public static void main(String[] args) {
        AustralianTraffic a = new AustralianTraffic();
        a.trainSpeed();
        a.trainsymbol();

    }

    @Override
    public void trainsymbol() {
        System.out.println("Hello Train!");
    }

    @Override
    public void trainSpeed() {
        System.out.println(390 + "Km/h");
    }
}
