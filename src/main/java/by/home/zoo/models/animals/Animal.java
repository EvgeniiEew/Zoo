package by.home.zoo.models.animals;

import by.home.zoo.interfaces.Entity;

public abstract class Animal implements Entity {
    protected boolean alive;
    public int weight;
    public String size, color, nickname; //размер,цве,кличка
    public int eatFoodPerDay;
    public int doDirtPerDay;

    public Animal(String size, String color, String nickname, int weight, int eatFoodPerDay, int doDirtPerDay) {
        this.weight = weight;
        this.color = color;
        this.nickname = nickname;
        this.size = size;
        this.eatFoodPerDay = eatFoodPerDay;
        this.doDirtPerDay = doDirtPerDay;
    }
    public abstract  int getDoDirtPerDay();
    public abstract void eat();

    public abstract void sleep();
}
