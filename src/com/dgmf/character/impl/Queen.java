package com.dgmf.character.impl;

import com.dgmf.character.Character;
import com.dgmf.strategy.impl.BowAndArrow;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrow();
    }

    @Override
    public void fight() {
        System.out.println("I'm a Queen ...");
        weapon.useWeapon();
    }
}
