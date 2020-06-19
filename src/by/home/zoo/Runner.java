package by.home.zoo;

import by.home.zoo.impl.animals.Ostrich;
import by.home.zoo.impl.animals.Shark;

public class Runner {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(2, 100, (byte) 100);

        Ostrich straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 10,20);
        Ostrich straus1 = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 10,20);
        Ostrich straus2 = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 10,20);
        Ostrich straus4 = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 10,20);

        Shark akula = new Shark("Средний", "Серая", "Вася", 120,10,20);
        zoo.addAnimal(straus);
       // zoo.addAnimal(akula);
        zoo.addAnimal(straus1);
        zoo.addAnimal(straus2);
        zoo.addAnimal(straus4);

        zoo.printZooStatus();



        //Cleaner sergei = new Cleaner(12, "22.01.11","Убрал 2 вальера");
        // sergei.currentWorkVolume();
        //Ostrich s1 = new Ostrich(true,"21", "red", "Вася", 8, "быстрая");
        // s1.isAlive();
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


    //  Timer timer1 = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                //код который выполняется каждую секунду
//                a++;
//                if (a > 24){
//                    timer1.stop();
//                }
//            }
//        }) timer1.startt();

}

