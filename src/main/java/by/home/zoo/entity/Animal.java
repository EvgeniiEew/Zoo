package by.home.zoo.entity;
import by.home.zoo.enums.Size;
import by.home.zoo.interfaces.Entity;

public abstract class Animal  implements Entity {
    public int weight;
    public String nickname;
    public int eatFoodPerDay;
    public int doDirtPerDay;

    public Animal(String nickname, int weight, int eatFoodPerDay, int doDirtPerDay) {
        this.weight = weight;
        this.nickname = nickname;
        this.eatFoodPerDay = eatFoodPerDay;
        this.doDirtPerDay = doDirtPerDay;
    }

    public abstract int getDoDirtPerDay();

    public abstract void eat();

    public abstract void sleep();
}
