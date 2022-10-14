package com.vasilev.lesson15;

public class Haval extends Car {
    public Haval(String color, int price) {
        super(color, price);
    }

    @Override
    public void run() {
        System.out.println("Haval top!");
    }
}
