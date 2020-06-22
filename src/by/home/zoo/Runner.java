package by.home.zoo;

import by.home.zoo.impl.animals.Crocodile;
import by.home.zoo.impl.animals.Ostrich;
import by.home.zoo.impl.animals.Shark;
import by.home.zoo.service.DailyService;
import by.home.zoo.service.DayScheduler;

import java.util.Timer;

public class Runner {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(0, 100);
        DailyService dailyService = new DailyService();

        zoo.addCell(3, 5);

        Ostrich straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 10, 10);
        Shark akula = new Shark("Средний", "Серая", "Вася", 120, 10, 20);
        Crocodile crocodile = new Crocodile(123, "Large", "Brown", "Avon", 180, 60, 30);

        zoo.addAnimal(straus);
        zoo.addAnimal(akula);
        zoo.addAnimal(akula);
        zoo.addAnimal(crocodile);
        zoo.addAnimal(crocodile);
        zoo.addAnimal(crocodile);

        Timer timer = new Timer();
        timer.schedule(new DayScheduler(zoo, dailyService), 0, 5000);
    }
}

