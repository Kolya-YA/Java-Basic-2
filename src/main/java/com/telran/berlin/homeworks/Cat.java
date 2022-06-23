package com.telran.berlin.homeworks;

import java.util.Arrays;

public class Cat {

    private String name;
    private int age;
    private boolean maleGender;
    private String breed;
    private String color;
    private String[] favoriteFood;
    private String[] friendsList;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setMaleGender(boolean newSex) {
        maleGender = newSex;
    }

    public boolean getMaleGender() {
        return maleGender;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public String getBreed() {
        return breed;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void setFavoriteFood(String[] newColor) {
        favoriteFood = newColor;
    }

    public String getFavoriteFood() {
        return Arrays.toString(favoriteFood);
    }

    public void setFriendsList(String[] newFriendsList) {
        friendsList = newFriendsList;
    }

    public String getFriendsList() {
        return Arrays.toString(friendsList);
    }
}