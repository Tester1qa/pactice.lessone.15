package com.vasilev.lesson15;

import java.util.Objects;

public abstract class Car {
    protected String color;
    protected int price;

    public Car(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void run() {
        System.out.println(" Bep bep");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(color, car.color);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(color, price);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
