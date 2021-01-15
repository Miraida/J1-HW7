package com.company;

public class Main {

    public static void main(String[] args) {

        Hero[] hero = {new Magic(),new Medic(),new Warrior()};
        int i=0;
        for (HeroesAbility ability: HeroesAbility.values() ) {
              hero[i].applySuperAbility(ability.toString());
              i++;
        }




    }
}
