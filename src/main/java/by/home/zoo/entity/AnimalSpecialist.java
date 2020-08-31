package by.home.zoo.entity;

import by.home.zoo.Cell;
import by.home.zoo.interfaces.Daily;
import by.home.zoo.models.humans.Worker;
import by.home.zoo.service.DailyService;

import java.util.Date;
import java.util.HashSet;

public class AnimalSpecialist extends Worker implements Daily {
    private int maxFoodToAnimalsPerDay;
    private int remainingFoodToAnimalsPerDay;
    private HashSet<Cell> cells;
    private final SupplyStorage supplyStorage;

    public AnimalSpecialist(int age,
                            String name,
                            int salary,
                            Date employmentDate,
                            int maxFoodToAnimalsPerDay,
                            HashSet<Cell> cells,
                            SupplyStorage supplyStorage

    ) {
        super(salary, employmentDate, age, name);
        this.maxFoodToAnimalsPerDay = maxFoodToAnimalsPerDay;
        this.cells = cells;
        this.supplyStorage = supplyStorage;
    }

    public void healAnimal() { //лечить животных
    }

    public void orderDrugs() {//заказать лекарство
    }

    public void feedAnimals() {
        for (Cell cell : cells) {
            if (cell.getNecessaryDailyFood() >= this.remainingFoodToAnimalsPerDay) {
                cell.addFood(this.remainingFoodToAnimalsPerDay);
                this.remainingFoodToAnimalsPerDay = 0;
                break;
            } else {
                cell.addFood(cell.getNecessaryDailyFood());
                this.remainingFoodToAnimalsPerDay = this.remainingFoodToAnimalsPerDay - cell.getNecessaryDailyFood();
            }
        }
    }

    public void updateDailyRemainingFood() {
        if (this.remainingFoodToAnimalsPerDay > 0) {
            int surplus = this.maxFoodToAnimalsPerDay - this.remainingFoodToAnimalsPerDay;
            this.remainingFoodToAnimalsPerDay = this.remainingFoodToAnimalsPerDay + this.supplyStorage.takeFood(surplus);
            return;
        }
        this.remainingFoodToAnimalsPerDay = this.supplyStorage.takeFood(this.maxFoodToAnimalsPerDay);
    }

    @Override
    public void think() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doAnimalSpecialistDaily(this);
    }

    @Override
    public void currentWorkVolume() {

    }

    @Override
    public boolean work() {
        return false;
    }
}
