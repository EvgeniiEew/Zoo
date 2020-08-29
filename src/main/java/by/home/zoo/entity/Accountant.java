package by.home.zoo.impl.humens;

import by.home.zoo.interfaces.Daily;
import by.home.zoo.interfaces.Work;
import by.home.zoo.models.humans.Worker;
import by.home.zoo.models.utils.SafeMoney;
import by.home.zoo.models.utils.SupplyStorage;
import by.home.zoo.service.DailyService;

import java.util.Date;
import java.util.HashSet;

public class Accountant extends Worker implements Work, Daily {
    private int maxFoodOrder;
    private final SupplyStorage supplyStorage;
    private final SafeMoney safeMoney;
    private final HashSet<Worker> workers;

    public Accountant(int salary, Date dateEmployment, int age,
                      String name, int maxFoodOrder,
                      SupplyStorage supplyStorage, SafeMoney safeMoney,
                      HashSet<Worker> workers) {
        super(salary, dateEmployment, age, name);
        this.maxFoodOrder = maxFoodOrder;
        this.supplyStorage = supplyStorage;
        this.safeMoney = safeMoney;
        this.workers = workers;
    }

    public void payOutSalary() {
        long workersSalary = this.workers.stream().map(Worker::getSalary).reduce(Integer::sum).get();
        safeMoney.getMoney(workersSalary);
    }

    public void orderFood() {
        long moneyToFood = maxFoodOrder * 14;
        long getMoneyToFood = safeMoney.getMoney(moneyToFood);
        if (getMoneyToFood < moneyToFood) {
            int recalculationOfTheAmountOfFood = (int) getMoneyToFood / 14;
            supplyStorage.addFood(recalculationOfTheAmountOfFood);
        } else {
            supplyStorage.addFood(maxFoodOrder);
        }
    }

    public void sellTickets() {
        this.safeMoney.addMoney((long) (Math.random() * 10000));
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
