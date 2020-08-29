package by.home.zoo.impl.humens;

import by.home.zoo.Cell;
import by.home.zoo.interfaces.Daily;
import by.home.zoo.models.humans.Worker;
import by.home.zoo.service.DailyService;

import java.util.Date;
import java.util.HashSet;


public class ServiceStaff extends Worker implements Daily { //убиорщики
    protected String amountOfCleaned; // количество убраного
    int maxDailyPurity; // количества убираемого дерьма в день
    int remainingDailyPurity;
    int salary;
    HashSet<Cell> cells;

    public ServiceStaff(
            String name,
            int age,
            int salary,
            Date employmentDate,
            int maxDailyPurity,
            HashSet<Cell> cells
    ) {
        super(salary, employmentDate, age, name);
        this.maxDailyPurity = maxDailyPurity;
        this.remainingDailyPurity = maxDailyPurity;
        this.cells = cells;
    }

    public void currentWorkVolume() {
        System.out.println("качество работы");
    }

    //убрать територию метод
    private void cleanTheTerritory() {

    }

    //убрать животных
    private void cleanTheAnimal() {

    }

    @Override
    public void think() {
        System.out.println("...");
    }

    @Override
    public void talk() {

    }

    @Override
    public boolean work() {
        return false;
    }

    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doCleanerDaily(this);
    }

    public void updateDailyRemainingPurity() {
        this.remainingDailyPurity = this.maxDailyPurity;
    }

    public void cleanCells() {
        for (Cell cell : this.cells) {
            this.remainingDailyPurity = cell.clean(this.remainingDailyPurity);
            if (this.remainingDailyPurity == 0) {
                break;
            }
        }
    }
}
