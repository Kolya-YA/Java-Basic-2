package com.telran.berlin;

import com.telran.berlin.homeworks.Cat;
import com.telran.berlin.homeworks.Convertor;
import com.telran.berlin.homeworks.Dog;
import com.telran.berlin.homeworks.Vars;

public class Runner {

    public static void varRunner() {
        System.out.println("——— Variables ———");
        Vars vars = new Vars();
        vars.printAllVars();
    }

    public static void catRunner() {
        Cat cat = new Cat();

        cat.setName("Loki");
        cat.setAge(4);
        cat.setMaleGender(true);
        cat.setBreed("British Longhair");
        cat.setColor("gray");
        cat.setFavoriteFood(new String[]{"fish", "turkey", "cheese"});
        cat.setFriendsList(new String[]{"Oliver", "Lucy", "Willow"});

        System.out.println();
        System.out.println("——— Cat ———");

        System.out.println("My cat's name is " + cat.getName() + ".");
        System.out.println("My cat is " + cat.getAge() + " years old.");
        System.out.println("My cat is male is " + cat.getMaleGender() + ".");
        System.out.println("My cat's breed is " + cat.getBreed() + ".");
        System.out.println("My cat's color is " + cat.getColor() + ".");
        System.out.println("My cat's favorite food: " + cat.getFavoriteFood() + ".");
        System.out.println("My cat's buddies are named: " + cat.getFriendsList() + ".");
    }

    public static void dogRunner() {
        System.out.println();
        System.out.println("——— Dog ———");
        Dog myDog = new Dog();
        myDog.setDogParams("Cooper", "Bull Terrier", (byte) 3);
        System.out.println(myDog.getDogParams());
    }

    static void convertorRunner() {
        Convertor.calc();
    }
}
