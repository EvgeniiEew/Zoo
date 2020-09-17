package by.home.zoo.entity;

import by.home.zoo.interfaces.Daily;
import by.home.zoo.interfaces.Work;
import by.home.zoo.service.DailyService;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accountants")
public class Accountant implements Work, Daily {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private int salary;

    @Column(name = "employment_date")
    private Date dateEmployment;

    @Column(name = "max_food_order")
    private int maxFoodOrder;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

//    private SupplyStorage supplyStorage;
//    private BankAccount bankAccount;

//    private HashSet<Worker> workers;

    public Accountant() {
    }

    public Accountant(int age, String name, int salary, Date dateEmployment, int maxFoodOrder, Zoo zoo) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.dateEmployment = dateEmployment;
        this.maxFoodOrder = maxFoodOrder;
        this.zoo = zoo;
    }

//    public Accountant(int salary, Date dateEmployment, int age,
//                      String name, int maxFoodOrder,
//                      SupplyStorage supplyStorage, BankAccount bankAccount,
//                      HashSet<Worker> workers) {
//        super(salary, dateEmployment, age, name);
//        this.maxFoodOrder = maxFoodOrder;
//        this.supplyStorage = supplyStorage;
//        this.bankAccount = bankAccount;
//        this.workers = workers;
//    }

//    public void payOutSalary() {
//        long workersSalary = this.workers.stream().map(Worker::getSalary).reduce(Integer::sum).get();
//        bankAccount.getMoney(workersSalary);
//    }
//
//    public void orderFood() {
//        long moneyToFood = maxFoodOrder * 14;
//        long getMoneyToFood = bankAccount.getMoney(moneyToFood);
//        if (getMoneyToFood < moneyToFood) {
//            int recalculationOfTheAmountOfFood = (int) getMoneyToFood / 14;
//            supplyStorage.addFood(recalculationOfTheAmountOfFood);
//        } else {
//            supplyStorage.addFood(maxFoodOrder);
//        }
//    }
//
//    public void sellTickets() {
//        this.bankAccount.addMoney((long) (Math.random() * 10000));
//    }

//    @Override
//    public void currentWorkVolume() {
//
//    }

    @Override
    public boolean work() {
        return false;
    }

//    @Override
//    public void think() {

//    }

//    @Override
//    public void talk() {

//    }

    @Override
    public void doDaily(DailyService dailyService) {
   //     dailyService.doBoogalterDaily(this);
    }

//    public void delete(Accountant deleted) {
//    }
//
//    public Iterable<Accountant> findAllByOrderByTitle() {
//    }
//
//    public Accountant findOne(Long id) {
//    }
//
//    public Accountant save(Accountant persisted) {
//    }
//
}
