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
    Random rnd = new Random();

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
        System.out.println("Jakiej rasy jest twoja postać? \n Człowiek, Krasnolud czy Ogr?");
        String choiceSpecies = scanner.next();
        switch (choiceSpecies){
            case "Człowiek":
                this.species = Species.CZLOWIEK;
                break;
            case "Krasnolud":
                this.species = Species.KRASNOLUD;
                break;
            case "Ogr":
                this.species = Species.OGR;
                break;
            default:
                System.out.println("Chyba umiesz poprawnie napisać nazwę swojej rasy? Spróbuj jeszcze raz.");
        }
        System.out.println("Ok, twoja postać to: " + this.species);
        System.out.println("Jak nazywa się twoja postać?");
        this.name = scanner.next();

        System.out.println("Ile ma defa? (Wpisz L, by wylosować)");
        String def = scanner.next();
        if (def.equals("L")){
            this.def = rnd.nextInt(10) + 1;
        System.out.println("Twoja postać ma: " + this.def + " obrony.");
        }
        System.out.println("Ile ma hp? (Wpisz L, by wylosować)");
        String hp = scanner.next();
        if (hp.equals("L")){
            this.hp = rnd.nextInt(10) + 1;
            System.out.println("Twoja postać ma: " + this.hp + " punktów życia.");
        }
        System.out.println("Ile ma power? (Wpisz L, by wylosować)");
        String power = scanner.next();
        if (power.equals("L")){
            this.power = rnd.nextInt(10) + 1;
            System.out.println("Twoja postać ma: " + this.power + " siły.");
        }
        System.out.println("Ile ma ini? (Wpisz L, by wylosować)");
        String ini = scanner.next();
        if (ini.equals("L")){
            this.ini = rnd.nextInt(10) + 1;
            System.out.println("Twoja postać ma: " + this.ini + " inicjatywy.");
        }

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
