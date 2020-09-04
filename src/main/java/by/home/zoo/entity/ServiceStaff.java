package by.home.zoo.entity;

import by.home.zoo.interfaces.Daily;
//import by.home.zoo.models.humans.Worker;
import by.home.zoo.service.DailyService;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name = "service_staffs")
public class ServiceStaff implements Daily { //убиорщики

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "max_daily_purity")
    private int maxDailyPurity; // количества убираемого дерьма в день

    @Column(name = "remaining_daily_purity")
    private int remainingDailyPurity;

    @Column(name = "salary")
    private int salary;

    @Column(name = "employment_date")
    private Date employmentDate;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    public ServiceStaff() {

    }

    public ServiceStaff(int maxDailyPurity, int remainingDailyPurity, int salary, Date employmentDate, int age, String name, Zoo zoo) {
        this.maxDailyPurity = maxDailyPurity;
        this.remainingDailyPurity = remainingDailyPurity;
        this.salary = salary;
        this.employmentDate = employmentDate;
        this.age = age;
        this.name = name;
        this.zoo = zoo;
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

//    @Override
//    public void think() {
//        System.out.println("...");
//    }
//
//    @Override
//    public void talk() {
//
//    }
//
//    @Override
//    public boolean work() {
//        return false;
//    }

    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doCleanerDaily(this);
    }

    public void updateDailyRemainingPurity() {
        this.remainingDailyPurity = this.maxDailyPurity;
    }

//    public void cleanCells() {
//        for (Cell cell : this.cells) {
//            this.remainingDailyPurity = cell.clean(this.remainingDailyPurity);
//            if (this.remainingDailyPurity == 0) {
//                break;
//            }
//        }
//    }
}
