package com.company;


public class Main {


    public static void main(String[] args) {

        MagicalDoor door = new MagicalDoor();
        Hero[] heroes = door.newHeroes();

        Boss boss = new Boss("Titan", 1500, 50, "Metallic");
        boss.changeBossDefenceType("Golden");

        System.out.println("Name: " + boss.getBossName() + "\nHealth: " + boss.getBossHealth() + "\nDamage: " + boss.getBossDamage() + "\nDefence type: " + boss.getBossDefenceType() + "\n\n");

        for (int i = 0; i < door.newHeroes().length; i++) {
            System.out.println("Name: " + heroes[i].getHeroName() + "\nHealth: " + heroes[i].getHeroHealth() + "\nDamage: " + heroes[i].getHeroDamage() + "\nAttack type: " + heroes[i].getHeroAbility() + "\n\n");

        }


    }
}


