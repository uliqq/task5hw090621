package com.company;



public class Hero {
    private String heroName;
    private int heroHealth;
    private int heroDamage;
    private String heroAbility;

    public Hero(String heroName, int heroHealth, int heroDamage, String heroAbility) {
        this.heroName = heroName;
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroAbility = heroAbility;


    }
    public Hero(int i, int i1) {

    }
    public Hero() {

    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) { this.heroName = heroName; }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroAbility() {
        return heroAbility;
    }

    public void setHeroAbility(String heroAbility) {
        this.heroAbility = heroAbility;
    }
}


