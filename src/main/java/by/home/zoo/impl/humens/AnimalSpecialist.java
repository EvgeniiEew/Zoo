package by.home.zoo.impl.humens;

import by.home.zoo.Cell;
import by.home.zoo.interfaces.Daily;
import by.home.zoo.models.humans.Administration;
import by.home.zoo.models.utils.SupplyStorage;
import by.home.zoo.service.DailyService;

import java.util.HashSet;

public class AnimalSpecialist extends Administration implements Daily {
    int maxFoodToAnimalsPerDay;
    int remainingFoodToAnimalsPerDay;
    HashSet<Cell> cells;
    long moneySpent;
    private final SupplyStorage supplyStorage;

    public AnimalSpecialist(int age,
                            String name,
                            int maxFoodToAnimalsPerDay,
                            HashSet<Cell> cells,
                            SupplyStorage supplyStorage

    ) {
        super(age, name);
        this.maxFoodToAnimalsPerDay = maxFoodToAnimalsPerDay;
        this.cells = cells;
        this.supplyStorage = supplyStorage;
    }

    public void healAnimal() { //лечить животных

    }

    public void orderDrugs() {//заказать лекарство

    }

    //заказать еду
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
        this.remainingFoodToAnimalsPerDay = this.maxFoodToAnimalsPerDay;
    }


    public long GetMoney() {
        return this.moneySpent;
    }


    @Override
    public void checkTheQualityOfWork() {

    }

    @Override
    public void relax() {

    }

    @Override
    public void think() {

    }

    @Override
    public void talk() {

    }

    @Override
    public boolean lead() {
        return false;
    }

    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doAnimalSpecialistDaily(this);
    }
}
