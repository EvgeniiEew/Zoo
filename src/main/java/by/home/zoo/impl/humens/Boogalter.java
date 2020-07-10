package by.home.zoo.impl.humens;

import by.home.zoo.interfaces.SalaryGeveOut;
import by.home.zoo.interfaces.Work;
import by.home.zoo.models.humans.Workers;

import java.util.Date;

public class Boogalter extends Workers implements Work, SalaryGeveOut {
    public Boogalter(int experience, Date dateEmployment, int age, String name) {
        super(experience, dateEmployment, age, name);
    }

    @Override
    public void salaryGeveOut() {

    }

    @Override
    public void getSalary() {

    }

    @Override
    public void currentWorkVolume() {

    }

    @Override
    public boolean work() {
        return false;
    }

    @Override
    public void think() {

    }

    @Override
    public void talk() {

    }
}
