package com.witas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        Player hero1 = new Player(Species.CZLOWIEK,"Felix",2,15,5,4,true);
        Player hero2 = new Player(Species.KRASNOLUD, "Gotrek",5,25,7,5,true);
        Player enemy = new Player(Species.OGR,"Ogr",6,30,7,2,true);
        Player person = new Player(Species.CZLOWIEK,"person",1,1,1,1,true);

        person.createPlayer();



//        while ((hero1.lives || hero2.lives) && enemy.lives) {
//
//            if (hero1.lives) {
//                int roll = rnd.nextInt(10) + 1;
//                hero1.attack(roll, enemy);
//            }
//            if (hero2.lives && enemy.lives) {
//                int roll = rnd.nextInt(10) + 1;
//                hero2.attack(roll, enemy);
//            }
//            if (enemy.lives) {
//                int roll = rnd.nextInt(10) + 1;
//                int rollToDirect = rnd.nextInt(2);
//                if ((rollToDirect == 0 && hero1.lives) || !hero2.lives)
//                    enemy.attack(roll, hero1);
//                else if ((rollToDirect == 1 && hero2.lives) || !hero1.lives)
//                    enemy.attack(roll, hero2);
//                else {}
//                if (!(hero1.lives || hero2.lives))
//                    System.out.println("Ogr: Roaaar!!!");
//            }
//        }
    }
}