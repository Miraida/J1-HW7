package com.company;

public abstract class Hero implements HavingSuperAbility{
    int health;
    int damage;
    String typeOfSuperAbility;

    @Override
    public abstract void applySuperAbility(String superAbilityType);
}
