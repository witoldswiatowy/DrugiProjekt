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

//    void hit (int roll){
//        int demage = this.power + roll;
//        System.out.println("Ilość obrażeń: " + demage);
//    }

    void attack (int roll, Player target){
        demage = this.power + roll;
        target.hp -= target.def - this.demage;
        System.out.println(target.name + " został zaatakowany za " + this.demage + " i ma " + target.hp + " życia.");

    }

}
