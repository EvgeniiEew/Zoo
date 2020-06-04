package by.home.zoo.impl.animals;

import by.home.zoo.models.animals.Fish;

public class KillerWhale extends Fish {

    public KillerWhale(String size, String color, String nickname, int weight) {
        super(size, color, nickname, weight);
    } //касатки


    protected void sing() {  //петь

    }

    protected void strand() { // вброситься на берег

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
