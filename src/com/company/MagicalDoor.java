package com.company;

public class MagicalDoor {

    public Hero[] newHeroes() {
        Hero thor = new Hero("Thor",500, 30, "Electricity");
        Hero spiderMan = new Hero("Spider-Man",400, 25, "Agility");
        Hero hulk = new Hero("Hulk",700, 20, "Strength");
        Hero ironMan = new Hero("Iron Man",500, 40, "Technology");

        Hero[] array = {thor, spiderMan, hulk, ironMan};
        return array;

    }

}
