package com.dgmf.character.impl;

import com.dgmf.character.Character;
import com.dgmf.strategy.impl.Ax;
import com.dgmf.strategy.impl.BowAndArrow;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrow();
    }

    @Override
    public void fight() {
        this.score += 4;
        System.out.println("I'm a Queen ...");
        weapon.useWeapon();
        System.out.println("Queen's Score Current : " + score);
        if(score > 15) {
            this.setWeapon(new Ax());
        }
        System.out.println("****");
    }
}
