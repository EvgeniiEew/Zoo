package by.home.zoo.models.animals;

import by.home.zoo.interfaces.Flying;

public abstract class Bird extends Animal implements Flying {

    protected boolean canFly;
    protected boolean wingspan; //крылья

    public Bird(String size, String color, String nickname, int weight) {
        super(size, color, nickname, weight);
    }

    public abstract void peck(); // клевать

    protected abstract void cleanFeathers(); //чистить перья
}
