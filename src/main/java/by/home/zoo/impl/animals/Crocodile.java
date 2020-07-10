package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Reptiles;

public class Crocodile extends Reptiles { //крокодилы
    int biteForce; //сила укуса
    byte length;

    public Crocodile(int biteForce, String size, String color, String nickname, int weight, int needFoodPerDay, int doDirtPerDay) {
        super(size, color, nickname, weight, needFoodPerDay, doDirtPerDay);
        this.biteForce = biteForce;
    }

    public void dive() {
    } //нырять

    @Override
    public void bite() {

    }

    @Override
    public void baskUnderTheSun() {

    }

    @Override
    public boolean isCanRun() {
        return false;
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
