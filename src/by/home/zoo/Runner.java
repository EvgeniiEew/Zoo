package by.home.zoo;
//import impl.Cat;


import by.home.zoo.impl.animals.Ostrich;

public class Runner {

    public static void main(String[] args) {

        //Cleaner sergei = new Cleaner(12, "22.01.11","Убрал 2 вальера");
       // sergei.currentWorkVolume();
        Ostrich s1 = new Ostrich(true,"21", "red", "Вася", 8, "быстрая");
        s1.isAlive();
        /* Cat cat1 = new Cat(true, "4 ноги", "Василий");
        Cat cat2 = new Cat("2 ноги", "Сергей");
        Cat cat3 = new Cat("1 нога", "Антон");
        Dog dog1 = new Dog(true);
        System.out.println("Жив ли кот: " + cat1.isAlive());
        System.out.println("Жива ли собака: " + dog1.isAlive());
        cat1.vivod();
        cat2.vivod();
        cat3.vivod("green");
        System.out.println(cat1.isAlive());
        Mass m1 = new Mass();
        m1.mass();
        System.out.println(" ");
        Newborn aist = new Newborn(true, 4.5, 41, 3);
        System.out.println(aist.impulseBirds() + " кг * м/c");
        aist.kilogramForcePerSquareCentimeterPlosadSurface();
    */
    }


}
