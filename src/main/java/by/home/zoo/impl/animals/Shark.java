package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Fish;

public class Shark extends Fish {

    public Shark(String size, String color, String nickname, int weight, int needFoodPerDay, int doDirtPerDay) {
        super(size, color, nickname, weight, needFoodPerDay, doDirtPerDay);
    }

    @Override
    public int getDoDirtPerDay() {
        return doDirtPerDay;
    }

    protected boolean hunt(boolean x) {
        return true;
    }

    protected void feelBlood() {

    }

    @Override
    public void stare() {

    }

    @Override
    public boolean swim() {
        return false;
    }

    @Override
    public void bite() {

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
