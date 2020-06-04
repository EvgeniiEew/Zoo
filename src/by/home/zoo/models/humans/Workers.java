package by.home.zoo.models.humans;

import by.home.zoo.interfaces.Work;

public abstract class Workers extends Human implements Work { // рабочие
    int experience;
    String dateEmployment;

    public Workers( int experience, String dateEmployment, int age, String name) {
        super(age, name);
        this.experience = experience;
        this.dateEmployment =dateEmployment;
    }
 // опыт и дата приема на работу поля
    public abstract void getSalary(); //получитть зп

    public abstract void currentWorkVolume(); // качество работы
}


