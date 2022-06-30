package com.telran.berlin.homeworks.game.hero;

import com.telran.berlin.game.constant.Constant;

public class Elf {
    static class Constant {
        static final int ELF_POWER = 8;
        static final String ELF_CHARISMA = "high";
        static final String ELF_MAGIC = "dark";
    }

    private long id;
    private int name;
    private int height;
    private int weight;
    private int hairColor;
    private int gender;

    public int getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHairColor() {

        return hairColor;
    }

    public int getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

