package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Fish;

public class Shark extends Fish {

    public Shark(String size, String color, String nickname, int weight) {
        super(size, color, nickname, weight);
    }

    protected boolean hunt(boolean x) { // охотиться
        return true;
    }

    protected void feelBlood() { //почуять кроу

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
