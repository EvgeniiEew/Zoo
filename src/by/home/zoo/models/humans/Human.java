package by.home.zoo.models.humans;

public abstract class Human {
    protected boolean alive = true;
    protected int age;
    protected String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void think();

    public abstract void talk();
}
