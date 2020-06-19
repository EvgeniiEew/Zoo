package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Mammals;

//рыси
public class Lynx extends Mammals {

    public Lynx(String size, String color, String nickname, int weight, int needFoodPerDay, int doDirtPerDay) {
        super(size, color, nickname, weight, needFoodPerDay, doDirtPerDay);
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

    public void purr() { //мурлыкать

    }

    public void play() {
    }
}
