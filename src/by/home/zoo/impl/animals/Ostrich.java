package by.home.zoo.impl.animals;


import by.home.zoo.models.animals.Bird;

public class Ostrich extends Bird  { // страусы
    String maxSpeed;

    public Ostrich(boolean isCanFly, String size, String color, String nickname, int weight , String maxSpeed) {
        super(size, color, nickname, weight);
        this.maxSpeed = maxSpeed;
        this.canFly= isCanFly;
    }

    protected void run(){

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
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public boolean isAlive() {
        System.out.println("true");
        return false;
    }

    @Override
    public boolean isCanMove() {
        return false;
    } //страусы

}
