package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Shelter shelter;
    private EnumColor enumColor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;

    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }{

    }


    public EnumColor getEnumColor() {
        return enumColor;
    }{

    }

    public void setEnumColor(EnumColor enumColor) {
        this.enumColor = enumColor;

    }


    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;

    }


    public String getInfo() {
        return "Age:" + age +
                "\nColor" + enumColor +
                "\nShelter:" + shelter;

    }
}



