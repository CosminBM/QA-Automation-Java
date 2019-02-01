package com.cosmin;

public class Human implements Character {
    private int ammo;
    private int health;
    private final boolean isDead = false;

    public Human(int ammo, int health) {
        this.ammo = ammo;
        this.health = health;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isDead() {
        return this.health <= 0 ? true : isDead;
    }

    public void shootAlien(Alien alien) {
        alien.setHealth(alien.getHealth() - 15);
        this.setAmmo(this.getAmmo() - 15);
    }
}