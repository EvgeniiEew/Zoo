package by.home.zoo.models.animals;

import by.home.zoo.interfaces.Run;

public abstract class Reptiles extends Animal implements Run { //рептирии

    public Reptiles(String size, String color, String nickname, int weight, int needFoodPerDay, int doDirtPerDay) {
        super(size, color, nickname, weight, needFoodPerDay, doDirtPerDay);
    }

    public abstract void bite();

    public abstract void baskUnderTheSun();

}
