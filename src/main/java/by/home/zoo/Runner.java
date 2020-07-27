package by.home.zoo;

import by.home.zoo.impl.animals.Crocodile;
import by.home.zoo.impl.animals.Ostrich;
import by.home.zoo.impl.animals.Shark;
import by.home.zoo.service.DailyService;
import by.home.zoo.service.DayScheduler;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Timer;

public class Runner {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(0, 100, 650000L);
        DailyService dailyService = new DailyService();

        zoo.addCell(3, 5);

        //  Ostrich straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 5, 10);
        String fileName = "C:\\Users\\Jack\\Desktop\\Zoo\\src\\main\\resources\\animals.json";
        try {
            String line = Files.lines(Paths.get(fileName)).reduce("", String::concat).substring(0,204);
            String line1 = Files.lines(Paths.get(fileName)).reduce("", String::concat).substring(204,376);
            Gson gson = new Gson();
            Ostrich straus = gson.fromJson(line, Ostrich.class);
            Shark akula = gson.fromJson(line1, Shark.class);
            zoo.addAnimal(straus);
            zoo.addAnimal(akula);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Shark akula = new Shark("Средний", "Серая", "Вася", 120, 10, 2);

        Crocodile crocodile = new Crocodile(123, "Large", "Brown", "Avon", 180, 5, 30);

        zoo.addAnimalSpecialist(30, "vasa", 500, 30);
        zoo.addBoogalter(500, 40, "valera", 20);
        zoo.addCleaner("Vasiiy", 36, 500, 10);
        zoo.addCleaner("Vladimir", 36, 500, 20);
        zoo.addCleaner("Nikolay", 24, 500, 0);


       // zoo.addAnimal(akula);
        zoo.addAnimal(crocodile);

        Timer timer = new Timer();
        timer.schedule(new DayScheduler(zoo, dailyService), 0, 5000);
    }
}

