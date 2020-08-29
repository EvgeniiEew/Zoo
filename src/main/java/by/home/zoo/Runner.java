package by.home.zoo;

import by.home.zoo.entity.Zoo;
import by.home.zoo.enums.Size;
import by.home.zoo.service.DailyService;
import by.home.zoo.service.DayScheduler;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Timer;

public class Runner {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String  user = "postgres";
        String pass = "1111";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement statement = conn.createStatement();
            ResultSet result =  statement.executeQuery("select * from service_staff");
            System.out.println(result.getString(0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Zoo zoo = new Zoo(0, 100, 650000L);
        DailyService dailyService = new DailyService();
        zoo.addCell(3, 5);
        //  Ostrich straus = new Ostrich(false, "Стредний", "коричневый", "Антон", 80, "быстрый", 5, 10);
        String fileName = "C:\\Users\\Jack\\Desktop\\Zoo\\src\\main\\resources\\animals.json";
        try {
            String line = Files.lines(Paths.get(fileName)).reduce("", String::concat).substring(0,204);
            String line1 = Files.lines(Paths.get(fileName)).reduce("", String::concat).substring(204,376);
            Gson gson = new Gson();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Shark akula = new Shark("Средний", "Серая", "Вася", 120, 10, 2);


        zoo.addAnimalSpecialist(30, "vasa", 500, 30);
        zoo.addBoogalter(500, 40, "valera", 20);
        zoo.addCleaner("Vasiiy", 36, 500, 10);
        zoo.addCleaner("Vladimir", 36, 500, 20);
        zoo.addCleaner("Nikolay", 24, 500, 0);


        Timer timer = new Timer();
        timer.schedule(new DayScheduler(zoo, dailyService), 0, 5000);
    }
}

