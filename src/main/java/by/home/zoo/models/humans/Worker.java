package by.home.zoo.models.humans;

import by.home.zoo.interfaces.Work;

import java.util.Date;

public abstract class Worker extends Human implements Work { // рабочие
    protected int salary;
    protected Date dateEmployment;

    public Worker(int salary, Date dateEmployment, int age, String name) {
        super(age, name);
        this.salary = salary;
        this.dateEmployment = dateEmployment;
    }

    public int getSalary() {
        return this.salary;
    }

    ; //получитть зп

    public abstract void currentWorkVolume(); // качество работы
}


