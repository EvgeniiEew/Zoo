package by.home.zoo.impl.humens;

import by.home.zoo.models.humans.Administration;

public class HRSpecialist extends Administration { // специалист по кадрам

    public HRSpecialist(int age, String name) {
        super(age, name);
    }

    public void hireAWorker() { // нанять рабочего

    }

    public void fireWorker() {
    } // Уволить рабочего

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
