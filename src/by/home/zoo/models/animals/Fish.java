package by.home.zoo.models.animals;

import by.home.zoo.interfaces.Swim;

public abstract class Fish extends Animal implements Swim {
    public byte finAmount; //количество плавники
    public int teethAmount; //количество зубы
    public abstract void bite(); //кусать

    public abstract void stare(); // пялиться
// плеваться камнями

    public Fish(String size, String color, String nickname, int weight) {

        super(size, color, nickname, weight);
    }

}
