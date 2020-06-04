package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Mammals;

public class DingoDog extends Mammals {
    // 2 метода

    public DingoDog(String size, String color, String nickname, int weight) {
        super(size, color, nickname, weight);
    }

    public void bark() {//лаять
    }

    @Override
    public void milkFeeding() {

    }

    @Override
    public void digHoles() {

    }

    @Override
    public boolean isCanRun() {
        return false;
    }

    @Override
    public boolean swim() {
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
