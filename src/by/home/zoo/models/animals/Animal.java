package by.home.zoo.models.animals;

import by.home.zoo.interfaces.Entity;

public abstract class Animal implements Entity {
    protected boolean alive;
    public int weight;
    public String size, color, nickname; //размер,цве,кличка

    Animal(String size, String color, String nickname, int weight) {
        this.weight = weight;
        this.color = color;
        this.nickname = nickname;
        this.size = size;
    }

    public abstract void eat();

    public abstract void sleep();
}
