package com.telran.berlin.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java homework!");
        System.out.println();

        // Variables create & print
        System.out.println("——— Variables ———");
        Vars vars = new Vars();
        vars.printAllVars();

        // Cat create & print
        Cat cat = new Cat();

        cat.setName("Loki");
        cat.setAge(4);
        cat.setMaleGender(true);
        cat.setBreed("British Longhair");
        cat.setColor("gray");
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

        System.out.println();
        System.out.println("——— Dog ———");
        Dog myDog = new Dog();
        myDog.setDogParams("Cooper","Bull Terrier", 3);
        System.out.println(myDog.getDogParams());
    }
}