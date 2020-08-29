package by.home.zoo.entity;

public class SupplyStorage {
    public int food;

    public SupplyStorage(int food) {
        this.food = food;
    }

    public int getFood(int get) {
        if (this.food >= get) {
            this.food = this.food - get;
            return get;
        } else {
            int a = this.food;
            this.food = 0;
            return a;
        }
    }

    public void addFood(int add) {
        this.food = this.food + add;
    }
}
