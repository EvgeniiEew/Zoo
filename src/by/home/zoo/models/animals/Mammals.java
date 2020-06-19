package by.home.zoo.models.animals;

import by.home.zoo.interfaces.Run;
import by.home.zoo.interfaces.Swim;

// Млекопитающие
public abstract class Mammals extends Animal implements Run, Swim {

    public Mammals(String size, String color, String nickname, int weight, int needFoodPerDay, int doDirtPerDay) {
        super(size, color, nickname, weight, needFoodPerDay, doDirtPerDay);
    }

    public abstract void milkFeeding(); //вскармливание молоком

    public abstract void digHoles(); //рыть ямы
}
