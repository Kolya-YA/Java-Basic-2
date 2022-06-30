package com.telran.berlin.game;

import com.telran.berlin.game.hero.Elf;

public class GameMain {
    public static void main() {
        Elf elf01 = new Elf();
        Elf elf02 = new Elf("Dobby");

        System.out.println(elf01.getElfInfo());
        System.out.println(elf02.getElfInfo());

        elf02.upLevel();
    }
}