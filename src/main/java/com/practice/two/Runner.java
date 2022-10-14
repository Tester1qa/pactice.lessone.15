package com.practice.two;

import com.vasilev.lesson15.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Commands choose;
        while (true) {
            System.out.println("Выберите команду: ADD/LIST/EXIT");
            choose = Commands.valueOf(sc.next().toUpperCase(Locale.ROOT));
            switch (choose) {
                case ADD:
                    System.out.println("Choose animal class: Cat/Dog/Duck");
                    String animalClass = sc.next();
                    Animal newAnimal = null;
                    if (animalClass.equals("Cat")) {
                        newAnimal = new Cat();
                        createAnimal(newAnimal, sc);
                    } else if (animalClass.equals("Dog")) {
                        newAnimal = new Dog();
                        createAnimal(newAnimal, sc);
                    } else if (animalClass.equals("Duck")) {
                        newAnimal = new Duck();
                        createAnimal(newAnimal, sc);
                    }
                    animals.add(newAnimal);
                    assert newAnimal != null;
                    newAnimal.say();
                    newAnimal.fly();
                    break;
                case LIST:
                    for (Animal c : animals) {
                        System.out.println(c);
                    }
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong enter");
            }
        }
    }

    private static void createAnimal(Animal newAnimal, Scanner search) {
        System.out.println("Enter name");
        newAnimal.setName(search.next());
        System.out.println("Choose age");
        newAnimal.setAge(search.nextInt());
        System.out.println("Set weight");
        newAnimal.setWeight(search.nextInt());
        System.out.println("Set color");
        newAnimal.setColor(search.next());
    }
}