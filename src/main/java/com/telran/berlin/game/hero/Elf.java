package com.telran.berlin.game.hero;

import com.telran.berlin.game.constant.Constant;

import java.util.Random;

public class Elf {

    private final long id;
    private String name;
    private boolean gender;
    private int level;
    private int fortune;

    private final int power;
    private final int charisma;
    private final int magic;

    public Elf() {
        this("NoName");
    }
    public Elf(String name) {
        Random rnd = new Random();

        this.id = rnd.nextLong();
        this.name = name;
        this.gender = rnd.nextBoolean();
        this.level = 0;
        this.fortune = rnd.nextInt(12);
        this.power = Constant.ELF_POWER;
        this.charisma = Constant.ELF_CHARISMA;
        this.magic = Constant.ELF_MAGIC;
    }

    public String getElfInfo() {
        return "\nElf ID: " + this.id
                + "\nName: " + this.name + ", Is female: " + this.gender
                + ",\nLevel: " + this.level + ", Fortune: " + this.fortune
                + ", Power: " + this.power + ", Charisma: " + this.charisma
                + ", Magic: " + this.magic;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public int getFortune() {
        return fortune;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeGender() {
        this.gender = !this.gender;
    }

    public void upLevel() {
        this.level++;
        System.out.println(
                Constant.ConsoleColors.WHITE_BRIGHT + "\nWhoo-hoo! " + Constant.ConsoleColors.RESET
                + Constant.ConsoleColors.GREEN + this.name + Constant.ConsoleColors.RESET
                + " is getting a new level: " + this.level
        );
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }
}
