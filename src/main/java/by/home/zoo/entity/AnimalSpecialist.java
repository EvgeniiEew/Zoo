package by.home.zoo.entity;

import by.home.zoo.interfaces.Daily;
import by.home.zoo.service.DailyService;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "animal_specialists")
public class AnimalSpecialist implements Daily {
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
    private Date employmentDate;

    @Column(name = "remaining_food_perDay")
    private int remainingFoodPerDay;

    @Column(name = "max_food_perDay")
    private int maxFoodPerDay;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    public AnimalSpecialist() {

    }

    public AnimalSpecialist(int age, String name, int salary, Date employmentDate, int remainingFoodPerDay, int maxFoodPerDay, Zoo zoo) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
        this.remainingFoodPerDay = remainingFoodPerDay;
        this.maxFoodPerDay = maxFoodPerDay;
        this.zoo = zoo;
    }

    public void healAnimal() { //лечить животных
    }

    public void orderDrugs() {//заказать лекарство
    }

    @Override
    public void doDaily(DailyService dailyService) {

    }

//    public void feedAnimals() {
//        for (Cell cell : cells) {
//            if (cell.getNecessaryDailyFood() >= this.remainingFoodToAnimalsPerDay) {
//                cell.addFood(this.remainingFoodToAnimalsPerDay);
//                this.remainingFoodToAnimalsPerDay = 0;
//                break;
//            } else {
//                cell.addFood(cell.getNecessaryDailyFood());
//                this.remainingFoodToAnimalsPerDay = this.remainingFoodToAnimalsPerDay - cell.getNecessaryDailyFood();
//            }
//        }
//    }

//    public void updateDailyRemainingFood() {
//        if (this.remainingFoodToAnimalsPerDay > 0) {
//            int surplus = this.maxFoodToAnimalsPerDay - this.remainingFoodToAnimalsPerDay;
//            this.remainingFoodToAnimalsPerDay = this.remainingFoodToAnimalsPerDay + this.supplyStorage.takeFood(surplus);
//            return;
//        }
//        this.remainingFoodToAnimalsPerDay = this.supplyStorage.takeFood(this.maxFoodToAnimalsPerDay);
//    }

//    @Override
//    public void think() {
//
//    }

//    @Override
//    public void talk() {
//
//    }

  //  @Override
   // public void doDaily(DailyService dailyService) {
     //   dailyService.doAnimalSpecialistDaily(this);
    }

//    @Override
//    public void currentWorkVolume() {
//
//    }

//    @Override
//    public boolean work() {
//        return false;
//    }

