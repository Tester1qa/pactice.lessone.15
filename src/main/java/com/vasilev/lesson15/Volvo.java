package com.vasilev.lesson15;

public class Volvo extends Car {
    public Volvo(String color, int price) {
        super(color, price);
    }

    @Override
    public void run() {
        System.out.println("Volvo bep bep");
    }
}
