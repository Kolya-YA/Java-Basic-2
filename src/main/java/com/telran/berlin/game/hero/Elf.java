package com.telran.berlin.game.hero;

import com.telran.berlin.game.constant.ConsoleColors;

import java.util.Random;

public class Elf {

    private long id;
    private String name;
    private boolean gender;
    private int level;
    private int fortune;

    private int power;
    private int charisma;
    private int magic;

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
        this.power = com.telran.berlin.game.constant.Elf.ELF_POWER;
        this.charisma = com.telran.berlin.game.constant.Elf.ELF_CHARISMA;
        this.magic = com.telran.berlin.game.constant.Elf.ELF_MAGIC;
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
                ConsoleColors.WHITE_BRIGHT + "\nWhoo-hoo! " + ConsoleColors.RESET
                + ConsoleColors.GREEN + this.name + ConsoleColors.RESET
                + " is getting a new level: " + this.level
        );
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
