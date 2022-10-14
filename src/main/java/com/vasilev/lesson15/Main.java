package com.vasilev.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Browsers browser = Browsers.valueOf("OPERA");
//        switch (browser) {
//            case CHROME:
//                System.out.println("Использую хром");
//                break;
//            case OPERA:
//                System.out.println("Использую оперу");
//                break;
//            case SAFARI:
//                System.out.println("использую сафари");
//                break;
//            case FIREFOX:
//                System.out.println("использую фаэрфокс");
//                break;
//            case CHROMIUM:
//                System.out.println("использую хромиум");
//                break;
//        }
//        Car lada = new Car("Red", 1000);
//        Car bmw = new Car("Red", 1000);
//        System.out.println(lada.equals(bmw));

        Scanner sc = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        while (true) {
            System.out.println("Enter command: add / list / exit ");
//            String userChose = sc.next();
            Commands userChose = Commands.valueOf(sc.next());

            switch (userChose) {
                case ADD:
                    System.out.println("Enter car name: volv0 / haval");
                    String carType = sc.next();
                    if (carType.equals("volvo")) {
                        System.out.println("Enter color");
                        String color = sc.next();
                        System.out.println("Enter price");
                        int price = sc.nextInt();
                        Volvo car = new Volvo(color, price);
                        car.run();
                        cars.add(car);
                    } else if (carType.equals("haval")) {
                        System.out.println("Enter color");
                        String color = sc.next();
                        System.out.println("Enter price");
                        int price = sc.nextInt();
                        Haval car = new Haval(color, price);
                        car.run();
                        cars.add(car);
                    }
                    break;
                case LIST:
                    for (Car car : cars) {
                        System.out.println("Вывожу лист данных: ");
                        System.out.println(car);
                    }
                    break;
                case EXIT:
                    System.out.println("Выход из программы!");
                    System.exit(0);
                default:
                    System.out.println("ERROR");
            }
        }
    }
}
