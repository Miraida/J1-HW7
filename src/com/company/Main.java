package com.company;

public class Main {

    public static void main(String[] args) {

        Hero[] hero = {new Magic(),new Medic(),new Warrior()};
        String[] heroesAbility = {"MAGICAL DAMAGE","HEALED ABILITY","CRITICAL DAMAGE"};
        for (int i = 0; i <hero.length ; i++) {
            hero[i].applySuperAbility(heroesAbility[i]);
        }


    }
}
