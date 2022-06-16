package com.telran.berlin.practice;

public class Dog {

    private String breed;
    private String name;
    private int age;

    public void setDogParams(String newName, String newBreed, int newAge) {
        name = newName;
        breed = newBreed;
        age = newAge;
    }

    public String getDogParams() {
        return name + ", " + breed + ", " + age + ".";
    }
}
