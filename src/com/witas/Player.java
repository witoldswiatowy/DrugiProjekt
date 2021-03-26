package com.witas;

import java.util.Random;

public class Player {

    Species species;
    String name;
    int def;
    int hp;
    int power;
    int ini;
    boolean lives;
    int demage;

    public Player(Species species, String name, int def, int hp, int power, int ini, boolean lives) {
        this.species = species;
        this.name = name;
        this.def = def;
        this.hp = hp;
        this.power = power;
        this.ini = ini;
        this.lives = lives;
    }

    void hit (int roll){
        int demage = this.power + roll;
        System.out.println(demage);
    }

    void attack (int demage, Player target){
        target.hit(demage);
    }

}
