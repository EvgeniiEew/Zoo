package by.home.zoo.entity;

import by.home.zoo.interfaces.Daily;
//import by.home.zoo.models.humans.Worker;
import by.home.zoo.service.DailyService;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo implements Daily {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="bank_account_id")
    private BankAccount bankAccount;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="supply_storage_id")
    private SupplyStorage supplyStorageSet;

    @OneToMany(mappedBy = "zoo", fetch = FetchType.EAGER)
    private Set<Accountant> accountants;

    @OneToMany(mappedBy = "zoo", fetch = FetchType.EAGER)
    private Set<Cell> cellSet;

    //    private final SupplyStorage supplyStorage;//
//    private final BankAccount bankAccount;//
//    private int averagePurity = 100;
//    HashSet<Cell> cells = new HashSet<>();//
//    HashSet<ServiceStaff> serviceStaffList = new HashSet<>();//
//    HashSet<AnimalSpecialist> animalSpecialists = new HashSet<>();//
//      HashSet<Accountant> accountants = new HashSet<>();//
//
//
////    public Zoo(int cellsNumber, int food, long money) {
//        for (int i = 1; i <= cellsNumber; i++) {
//            cells.add(new Cell(1));
//        }
//        this.supplyStorage = new SupplyStorage(food);
//        this.bankAccount = new BankAccount(money);
//    }
//
//    public int getDirtFormationPerDay() {
//        int allAnimalsDirt = 0;
//        for (Cell cell : this.cells) {
//            allAnimalsDirt = allAnimalsDirt + cell.getAllAnimalsDirt();
//        }
//        return allAnimalsDirt;
//    }
//
//    public void addCell(int cellsNumber, int capacity) {
//        for (int i = 1; i <= cellsNumber; i++) {
//            cells.add(new Cell(capacity));
//        }
//    }
//
//    public void addAnimalSpecialist(int age, String name, int salary, int maxFoodToAnimalsPerDay) {
//        AnimalSpecialist animalSpecial = new AnimalSpecialist(age, name, salary, new Date(),
//                maxFoodToAnimalsPerDay, this.cells, this.supplyStorage);
//        animalSpecialists.add(animalSpecial);
//    }
//
//    public void addBoogalter(int salary, int age, String name, int maxFoodOrder) {
//        HashSet<Worker> workers = new HashSet<>();
//        workers.addAll(this.serviceStaffList);
//        workers.addAll(this.animalSpecialists);
//        workers.addAll(accountants);
//        Accountant accountant = new Accountant(salary, new Date(), age, name, maxFoodOrder,
//                this.supplyStorage, this.bankAccount, workers);
//        accountants.add(accountant);
//
//    }
////    public long updateMoney() {
////        this.money = money - animalSpecialists.stream().map(AnimalSpecialist::GetMoney).reduce(Long::sum).get();
////        return this.money;
////    }
//
//    public void addCleaner(String name, int age, int salary, int ShitPerDayAmount) {
//        ServiceStaff serviceStaff = new ServiceStaff(name, age, salary, new Date(), ShitPerDayAmount, this.cells);
//        serviceStaffList.add(serviceStaff);
//    }
//
//    public HashSet<Cell> getCells() {
//        return cells;
//    }
//
//    public void addAnimal(Animal animal) {
//        boolean isAnimalAdded = false;
//        for (Cell cell : this.cells) {
//            if (!isAnimalAdded) { //for (int busySell=0; busySell < capacity ; busySell++) {
//                isAnimalAdded = cell.addAnimal(animal);
//            }
//        }
//        if (!isAnimalAdded) {
//            System.out.println("Нет места для животного");
//        }
//    }
//
//    public void addAnimals(List<Animal> animals) {
//        boolean isAnimalAdded = false;
//        for (Cell cell : this.cells) {
//            if (!isAnimalAdded) {
//                isAnimalAdded = cell.addAnimals(animals);
//            }
//        }
//        if (!isAnimalAdded) {
//            System.out.println("Нет места для животного");
//        }
//    }
//
//    public int getCellsCount() {
//        return cells.size();
//    }
//
//    // Add stream.reduce
//    public int getEmptyCellsCount() {
//        int count = 0;
//        for (Cell cell : this.cells) {
//            if (cell.isEmpty()) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // Add reduce
//    public String getAnimalTypes() {
//        String types = "";
//        for (Cell cell : this.cells) {
//            String animalType = cell.getAnimalsType().substring(cell.getAnimalsType().lastIndexOf('.') + 1);
//            types = types.concat(animalType).concat(" ");
//        }
//        return types;
//    }
//
//    public void printZooStatus() {
//        ZooLog zooLog = new ZooLog(
//                this.cells.size(),
//                this.getEmptyCellsCount(),
//                this.getAnimalTypes(),
//                this.supplyStorage.food,
//                this.averagePurity,
//                this.foodPerDay(),
//                this.getDirtFormationPerDay(),
//                this.bankAccount.money
//        );
//        zooLog.printToJSON();
//    }
//
//    public void updateFood() {
////        this.supplyStorage.food = supplyStorage.food + this.animalSpecialists.stream().map(AnimalSpecialist::getFood).reduce(Integer::sum).get();
////        this.supplyStorage.food = supplyStorage.food - this.cells.stream().map(Cell::getNecessaryDailyFood).reduce(Integer::sum).get();
//    }
//
//    public int foodPerDay() {
//        int allAnimalFoodPerDay = 0;
//        for (Cell cell : this.cells) {
//            allAnimalFoodPerDay = allAnimalFoodPerDay + cell.getNecessaryDailyFood();
//        }
//        return allAnimalFoodPerDay;
//    }
//
    @Override
    public void doDaily(DailyService dailyService) {
        //dailyService.doZooDaily(this);
    }
//
//    public void updatePurity() {
//        this.averagePurity = this.cells.stream().map(Cell::getPurity).reduce(Integer::sum).get() / this.cells.size();
//    }
//
//    public HashSet<ServiceStaff> getCleaners() {
//        return this.serviceStaffList;
//    }
//
//    public HashSet<AnimalSpecialist> getAnimalSpecialists() {
//        return this.animalSpecialists;
//    }
//
//    public HashSet<Accountant> getBoogalters() {
//        return this.accountants;
//    }
}

