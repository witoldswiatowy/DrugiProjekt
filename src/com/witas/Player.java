package com.witas;

import java.util.Random;
import java.util.Scanner;

public class Player {

    Species species;
    String name;
    int def;
    int hp;
    int power;
    int ini;
    boolean lives;
    int demage;
    Scanner scanner = new Scanner(System.in);

    public Player(Species species, String name, int def, int hp, int power, int ini, boolean lives) {
        this.species = species;
        this.name = name;
        this.def = def;
        this.hp = hp;
        this.power = power;
        this.ini = ini;
        this.lives = lives;
    }

    void createPlayer (){
        System.out.println("Jak nazywa się twoja postać?");
        this.name = scanner.next();
        System.out.println("Ile ma defa?");
        this.def = scanner.nextInt();
        System.out.println("Ile ma hp?");
        this.hp = scanner.nextInt();
        System.out.println("Ile ma power?");
        this.power = scanner.nextInt();
        System.out.println("Ile ma ini?");
        this.ini = scanner.nextInt();

        System.out.println(this.name);
        System.out.println(this.def);
        System.out.println(this.hp);
        System.out.println(this.power);
        System.out.println(this.ini);
    }

    void attack (int roll, Player target){

        if (target.lives) {
            demage = this.power + roll;
            target.hp += target.def - this.demage;
            System.out.println(target.name + " został zaatakowany za " + this.demage + " przez " + this.name + "a i ma " + target.hp + " życia.");
        }
        if (target.hp <= 0){
            target.lives = false;
            System.out.println();
            System.out.println("śmierć!!!");
            System.out.println(this.name + " zadał ostatni cios zabijając " + target.name + "a!");
            System.out.println();
        }
    }
}
