package by.home.zoo.service;

import by.home.zoo.Zoo;

import java.util.TimerTask;

public class DayScheduler extends TimerTask {
    private final Zoo zoo;
    private final DailyService dailyService;
    private int daysCount = 1;

    public DayScheduler(Zoo zoo, DailyService dailyService) {
        this.zoo = zoo;
        this.dailyService = dailyService;
    }

    public void run() {
        System.out.println("День - " + this.daysCount + "\n");
        dailyService.doFullZooDaily(this.zoo);
        zoo.printZooStatus();
        this.daysCount++;
    }
}
