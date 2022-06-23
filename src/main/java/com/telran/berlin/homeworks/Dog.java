package com.telran.berlin.homeworks;

public class Dog {

    private String breed;
    private String name;
    private byte age;

    public void setDogParams(String newName, String newBreed, byte newAge) {
        this.name = newName;
        this.breed = newBreed;
        this.age = newAge;
    }

    public String getDogParams() {
        return name + ", " + breed + ", " + age + ".";
    }
}
