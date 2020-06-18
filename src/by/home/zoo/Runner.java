package by.home.zoo;

import by.home.zoo.impl.animals.Ostrich;
import by.home.zoo.impl.animals.Shark;

public class Runner {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(2, 100, (byte) 100);

//     zoo.setPurity();
//     zoo.setFood();
//     zoo.setCell();

        Ostrich straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый");
        Shark akula = new Shark("Средний", "Серая", "Вася", 120);
       // System.out.println(zoo.getCellsCount()); // количество клеток
        zoo.addAnimal(straus);
        zoo.addAnimal(akula);
        zoo.printZooStatus();
        //zoo.getEmptyCellsCount();
        //zoo.NumFreeCell();
      // System.out.println(zoo.getAnimalTypes());
        //   zoo.addAnimal(Straus, akula);
        // System.out.println(straus.toString());
        // Cell cell = new Cell();
        // Ostrich Straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый");
        // Shark akula = new Shark("Средний","Серая","Вася",120);


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

