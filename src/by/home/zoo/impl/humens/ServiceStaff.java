package by.home.zoo.impl.humens;

import by.home.zoo.models.humans.Workers;

import java.util.Date;

public class ServiceStaff extends Workers { //обслуживаюзий персонал

    public ServiceStaff(int experience, Date dateEmployment, int age, String name) {
        super(experience, dateEmployment, age, name);
    }


    @Override
    public void currentWorkVolume() { // количество  работы  !currentWorkVolume

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

    public void orderEquipmentForWorkers() {    //заказть оборудование для рабочих
    }

    public void getSalary() { //пустой! получить зп

    }
}
