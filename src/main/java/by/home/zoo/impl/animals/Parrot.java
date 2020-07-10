package by.home.zoo.impl.animals;

import by.home.zoo.interfaces.Speak;
import by.home.zoo.models.animals.Bird;

public class Parrot extends Bird implements Speak { //попугаи

    public Parrot(boolean isCanFly, String size, String color, String nickname, int weight, int needFoodPerDay, int doDirtPerDay) {
        super(size, color, nickname, weight, needFoodPerDay, doDirtPerDay);
        this.canFly = isCanFly;
    }

    public void repeat(String string) {

    }

    @Override
    public boolean speak() {
        return false;
    }

    @Override
    public void peck() {

    }

    @Override
    protected void cleanFeathers() {

    }

    @Override
    public boolean isCanFly() {
        return this.canFly;
    }

    @Override
    public void fly() {

    }

    @Override
    public int getDoDirtPerDay() {
        return doDirtPerDay;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isCanMove() {
        return false;
    }
}
