package com.witas;

import java.util.Random;

/*
Zrobić to samo co w pierwszym programie, ale zrobić to inaczej. Pętle walki z continue,
a nie z tyloma if bo bedzie ładniej chyba

W Mainie zostawić tylko trzon a wszsytkie operacje dać do innych klas. Jak walke dać do classy,
która zbierać bedzie możliwości ataku i innych umiejętnośći jak unik.
 */
public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int roll = rnd.nextInt(10) + 1;

        Player hero1 = new Player(Species.CZLOWIEK,"Felix",2,15,5,4,true);
        Player hero2 = new Player(Species.KRASNOLUD, "Gotrek",5,25,7,5,true);
        Player enemy = new Player(Species.OGR,"Ogr",6,30,7,2,true);




       enemy.attack(roll,hero1);
       hero2.attack(roll,enemy);




//        int i1 = 0;
//        int i2 = 0;
//        int ie = 0;

//        while ((i1 < hero1.hp || i2 < hero2.hp) && ie < enemy.hp){
//
//            System.out.println("\n\nŻycie Felixa: " + hero1.hp + "; Życie Gotreka: " + hero2.hp + "; Życie Ogra: " + enemy.hp);
//            System.out.println("-----------------------");
//
//            if (enemy.lives) {
//                int roll = rnd.nextInt(10) + 1;
//                int hit = enemy.demage(roll);
//                int rollToDirect = rnd.nextInt(2);
////                if ((roll & 1) == 0 && hero1.lives) {
//                if ((rollToDirect == 0 && hero1.lives) || !hero2.lives) {
//                    System.out.println("Atak za " + hit + " obrażeń w Felixa");
//                    hero1.hp -= hit - hero1.def;
//                    System.out.println("Felixowi pozostało " + hero1.hp + " życia");
//                    if (hero1.hp <= 0){
//                        hero1.lives = false;
//
//                        System.out.println("Felix został zabity przez ogra!");
//                    }
//                }
////                else if((roll & 1) != 0 && hero2.lives){
//                else if((rollToDirect == 1 && hero2.lives) || !hero1.lives){
//                    System.out.println("Gotrek dostaje za " + hit + " obrażeń");
//                    hero2.hp -= hit - hero2.def;
//                    System.out.println("Gotrekowi pozostało " + hero2.hp + " życia");
//                    if (hero2.hp <= 0){
//                        hero2.lives = false;
//                        System.out.println("Niemożliwe! Gotrek dostąpił chwalebnej śmierci!");
//                    }
//                }
//                else {
//                }
//            }
//            if (hero1.lives) {
//                int rollF = rnd.nextInt(10) + 1;
//                int hitF = hero1.demage(rollF);
//                System.out.println("Felix atakuje za " + hitF + " obrażeń w ogra");
//                enemy.hp -= hitF - enemy.def;
//
//                System.out.println("Ogrowi pozostało " + enemy.hp + " życia");
//                if (enemy.hp <= 0) {
//                    enemy.lives = false;
//                    System.out.println("Ogr został zabity przez Felixa!");
//                    break;
//                }
//            }
//            if (hero2.lives){
//                int rollG = rnd.nextInt(10) + 1;
////                int hitG = hero2.power + rollG;
//                int hitG = hero2.demage(rollG);
//                System.out.println("Gotrek zadaje cios za " + hitG + " obrażeń w ogra");
//                enemy.hp -= hitG - enemy.def;
//                System.out.println("Ogrowi pozostało " + enemy.hp + " życia");
//                if (enemy.hp <= 0) {
//                    enemy.lives = false;
//                    System.out.println("Ogr został zmasakrowany przez Gotreka!");
//                }
//            }
//        }
//        System.out.println("Życie Felixa: " + hero1.hp + "; Życie Gotreka: " + hero2.hp + "; Życie Ogra: " + enemy.hp);
//
//        if (!hero1.lives && !hero2.lives){
//            System.out.println("\nOgr - Roaaaaaar!");
//        }
////                hero1.zaatakuj(enemy,hitF);
////        musiałbym wprowadzic zabezpieczenia, żeby przy zbyt wysokim def playerzy niedostawali dodatkowego życie przy ciosach w nich
    }
}