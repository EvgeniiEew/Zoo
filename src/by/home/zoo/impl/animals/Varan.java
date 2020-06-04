package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Reptiles;

public class Varan extends Reptiles {

    public Varan(String size, String color, String nickname, int weight) {
        super(size, color, nickname, weight);
    }

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
