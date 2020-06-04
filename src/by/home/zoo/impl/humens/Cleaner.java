package by.home.zoo.impl.humens;

import by.home.zoo.models.humans.Workers;


public class Cleaner extends Workers { //убиорщики
    protected String whatCleans; // что убирает
    protected String amountOfCleaned; // количество убраного

    public Cleaner(int experience, String dateEmployment, String amountOfCleaned, String whatCleans, boolean isCanAlive, int age, String name) {
        super(experience, dateEmployment, age, name);
        this.alive = isCanAlive;
        this.amountOfCleaned = amountOfCleaned;
        this.whatCleans = whatCleans;
    }

    public void currentWorkVolume() {
        System.out.println("качество работы");
    }

    public void getSalary() {   //получить зп

    }

    private void cleanTheTerritory() { //убрать територию метод

    }

    private void cleanTheAnimal() { //убрать животных

    }

    @Override
    public void think() {
        System.out.println("уборщик думает ...");
    }

    @Override
    public void talk() {

    }

    @Override
    public boolean work() {
        return false;
    }

}
