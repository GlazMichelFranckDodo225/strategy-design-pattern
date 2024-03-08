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
        score += 2;
        System.out.println("I'm a King ...");
        weapon.useWeapon();
        System.out.println("King's Current Score : " + score);
        System.out.println("****");
    }
}
