package com.company;

public class Grandpa {
    private EyeColor color;
    private String name;
    private int age;
    private Job job;

    public Grandpa(EyeColor color, String name, int age, Job job) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public EyeColor getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public void getInfo(){
        System.out.println("Name: " + name +
                "\nAge: " + age +
                "\nEye color: " + color +
                "\nJob: " + job.getJob());
    }
}


