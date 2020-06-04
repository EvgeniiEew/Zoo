package by.home.zoo.models.humans;

import by.home.zoo.interfaces.Leader;

public abstract class Administration extends Human implements Leader {

    public Administration(int age, String name) {
        super(age, name);
    }

    public abstract void checkTheQualityOfWork(); //проверить качество работы

    public abstract void relax();


}


