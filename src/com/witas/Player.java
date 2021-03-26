package com.witas;

public class Player {

    Species species;
    String name;
    int def;
    int hp;
    int power;
    int ini;
    boolean lives;

    public Player(Species species, String name, int def, int hp, int power, int ini, boolean lives) {
        this.species = species;
        this.name = name;
        this.def = def;
        this.hp = hp;
        this.power = power;
        this.ini = ini;
        this.lives = lives;
    }

    int demage(int roll){
        return this.power + roll;
        }
}
