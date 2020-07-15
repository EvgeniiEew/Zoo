package by.home.zoo.impl.humens;

import by.home.zoo.interfaces.Daily;
import by.home.zoo.interfaces.SalaryGeveOut;
import by.home.zoo.interfaces.Work;
import by.home.zoo.models.humans.Worker;
import by.home.zoo.models.utils.SafeMoney;
import by.home.zoo.models.utils.SupplyStorage;
import by.home.zoo.service.DailyService;

import java.util.Date;
import java.util.HashSet;

public class Boogalter extends Worker implements Work, SalaryGeveOut, Daily {
    private int maxFoodOrder;
    private long moneyToFood;
    private long salaryAmount;
    private final SupplyStorage supplyStorage;
    private final SafeMoney safeMoney;
    private final HashSet<Worker> workers;

    public Boogalter(int salary, Date dateEmployment, int age,
                     String name, int maxFoodOrder, long salaryAmount,
                     SupplyStorage supplyStorage, SafeMoney safeMoney,
                     HashSet<Worker> workers) {
        super(salary, dateEmployment, age, name);
        this.maxFoodOrder = maxFoodOrder;
        this.salaryAmount = salaryAmount;
        this.supplyStorage = supplyStorage;
        this.safeMoney = safeMoney;
        this.workers = workers;
    }

    @Override
    public void salaryGeveOut() {
        int worker = this.workers.size();
        safeMoney.getMoney(worker * salaryAmount);
    }

    public void orderFood() {
        this.moneyToFood = maxFoodOrder * 14;
        long getMoneyToFood = safeMoney.getMoney(this.moneyToFood);
        if (getMoneyToFood < moneyToFood) {
            int recalculationOfTheAmountOfFood = (int) getMoneyToFood / 14;
            supplyStorage.addFood(recalculationOfTheAmountOfFood);
        } else {
            supplyStorage.addFood(maxFoodOrder);
        }
    }

    @Override
    public void currentWorkVolume() {

    }

    @Override
    public boolean work() {
        return false;
    }

    @Override
    public void think() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doBoogalterDaily(this);
    }
}
