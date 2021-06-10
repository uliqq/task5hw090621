package com.company;


public class Boss {
    private String bossName;
    private int bossHealth;
    private int bossDamage;
    private String bossDefenceType;

    public Boss () {


    }

    public Boss(String bossName, int bossHealth, int bossDamage, String bossDefenceType) {
        this.bossName = bossName;
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossDefenceType = bossDefenceType;
    }

    public String getBossName() { return bossName; }

    public void setBossName(String bossName) { this.bossName = bossName; }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
    public void changeBossDefenceType (String bossDefenceType){
        this.bossDefenceType = bossDefenceType;
    }
}