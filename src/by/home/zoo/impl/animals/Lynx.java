package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Mammals;

//рыси
public class Lynx extends Mammals {
    //2 vtnjlf
    public Lynx(String size, String color, String nickname, int weight) {
        super(size, color, nickname, weight);
    }
    public void purr(){ //мурлыкать

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
