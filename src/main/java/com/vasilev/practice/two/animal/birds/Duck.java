package com.vasilev.practice.two.animal.birds;

import com.vasilev.practice.two.Flying;
import com.vasilev.practice.two.animal.Animal;

public class Duck extends Animal implements Flying {
    @Override
    public void say() {
        System.out.println("кря-кря-кря");
    }

    @Override
    public void fly() {
        System.out.print("Я лечу:");
    }
}