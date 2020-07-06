package by.home.zoo.impl.humens;

import by.home.zoo.models.humans.Administration;

public class AnimalSpecialist extends Administration {

    public AnimalSpecialist(int age, String name) {
        super(age, name);
    }

    public void healAnimal() { //лечить животных

    }

    public void orderDrugs() {//заказать лекарство

    }

    //заказать еду
    public void orderFood() {

    }

    @Override
    public void checkTheQualityOfWork() {

    }

    @Override
    public void relax() {

    }

    @Override
    public void think() {

    }

    @Override
    public void talk() {

    }

    @Override
    public boolean lead() {
        return false;
    }
}
