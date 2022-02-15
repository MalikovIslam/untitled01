package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] commands = {"Сидеть", "Лежать"};
        Shelter romashka = new Shelter();
        Dog layka = new Dog("Layka", "Dvornyaga", commands, EnumColor.Black, romashka);
        System.out.println(layka.getInfo());

    }
    {
        Father ObjectA = new Father(EyeColor.BROWN, "David", 29, new Job("Programmer"));
        Son ObjectB = new Son(EyeColor.BLUE, "Zack", 5, new Job("Student"));
        Son ObjectC = new Son(EyeColor.GRAY, "Kodi", 5, new Job("Student"));

        ObjectA.getInfo();
        System.out.println(ObjectA.skillToPlayBasketball(185, 8));
        System.out.println("-------------");
        ObjectB.getInfo();
        System.out.println(ObjectB.skillToPlayBasketball(159, 6));
        System.out.println("-------------");
        ObjectC.getInfo();
        System.out.println(ObjectC.skillToPlayBasketball(158, 6));

    }
}
