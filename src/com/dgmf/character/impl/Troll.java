package com.dgmf.character.impl;

import com.dgmf.character.Character;
import com.dgmf.strategy.impl.BowAndArrow;
import com.dgmf.strategy.impl.Dagger;

public class Troll extends Character {
    public Troll() {
        weapon = new Dagger();
    }

    @Override
    public void fight() {
        System.out.println("I'm a Troll ...");
        weapon.useWeapon();
    }
}
