package com.dgmf.strategy.impl;

import com.dgmf.strategy.Weapon;

public class Dagger implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("I Fight with a Dagger ...");
    }
}
