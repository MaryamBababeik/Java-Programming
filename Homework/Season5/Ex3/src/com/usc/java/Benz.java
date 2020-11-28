package com.usc.java;

public class Benz implements Car{

    @Override
    public void start() {
        System.out.println(" BENZ start ");
    }

    @Override
    public void stop() {
        System.out.println(" BENZ stop ");
    }

    @Override
    public void speed() {
        System.out.println(" BENZ speeed is 120 km/h ");
    }
}
