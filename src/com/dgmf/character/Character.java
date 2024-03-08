package com.dgmf.character;

import com.dgmf.strategy.Weapon;

public abstract class Character {
    protected String name;
    protected int score;
    protected Weapon weapon;

    public abstract void fight();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
