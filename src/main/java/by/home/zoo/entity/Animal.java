package by.home.zoo.entity;

import by.home.zoo.interfaces.Entity;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "animals")
public class Animal implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "weight")
    private int weight;

    @Column(name = "eat_food_per_day")
    private int eatFoodPerDay;

    @Column(name = "do_dirt_per_day")
    private int doDirtPerDay;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "cell_id")
    private Cell cell;

    public Animal(String nickname, int weight, int eatFoodPerDay, int doDirtPerDay) {
        this.weight = weight;
        this.nickname = nickname;
        this.eatFoodPerDay = eatFoodPerDay;
        this.doDirtPerDay = doDirtPerDay;
    }

    public Animal() {

    }

//    public abstract int getDoDirtPerDay();
//
//    public abstract void eat();
//
//    public abstract void sleep();

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isCanMove() {
        return false;
    }
}
