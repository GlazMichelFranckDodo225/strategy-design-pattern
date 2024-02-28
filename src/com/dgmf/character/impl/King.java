package com.dgmf.character.impl;

import com.dgmf.character.Character;
import com.dgmf.strategy.impl.Ax;
import com.dgmf.strategy.impl.BowAndArrow;

public class King extends Character {
    public King() {
        weapon = new Ax();
    }

    @Override
    public void fight() {
        System.out.println("I'm a King ...");
        weapon.useWeapon();
    }
}
