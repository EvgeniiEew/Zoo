package by.home.zoo.entity;

import javax.persistence.*;

@Entity
@Table(name = "supply_storage")
public class SupplyStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "food")
    public int food;

    public SupplyStorage() {
    }

    public SupplyStorage(int food) {
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int takeFood(int get) {
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
