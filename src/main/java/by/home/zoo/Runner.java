package by.home.zoo;

import by.home.zoo.impl.animals.Crocodile;
import by.home.zoo.impl.animals.Ostrich;
import by.home.zoo.impl.animals.Parrot;
import by.home.zoo.impl.animals.Shark;
import by.home.zoo.service.DailyService;
import by.home.zoo.service.DayScheduler;

import java.util.Timer;

public class Runner {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(0, 100);
        DailyService dailyService = new DailyService();

        zoo.addCell(3, 5);

        Ostrich straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 3, 10);
        Shark akula = new Shark("Средний", "Серая", "Вася", 120, 10, 2);
        Crocodile crocodile = new Crocodile(123, "Large", "Brown", "Avon", 180, 4, 30);

        zoo.addCleaner("Vasiiy", 36, 4, 10);
        zoo.addCleaner("Vladimir", 36, 4, 20);
        zoo.addCleaner("Nikolay", 24, 2, 0);

        zoo.addAnimal(straus);
        zoo.addAnimal(akula);
        zoo.addAnimal(crocodile);

//        zoo.printZooStatus();
//
//        stringJOb.statusPrintln();

        Timer timer = new Timer();
        timer.schedule(new DayScheduler(zoo, dailyService), 0, 5000);
    }
}

