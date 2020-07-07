package by.home.zoo;

import by.home.zoo.impl.humens.ServiceStaff;
import by.home.zoo.interfaces.Daily;
import by.home.zoo.models.animals.Animal;
import by.home.zoo.models.utils.ZooStatus;
import by.home.zoo.service.DailyService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Zoo implements Daily {
    private int food;
    private int averagePurity = 100;
    HashSet<Cell> cells = new HashSet<>();
    HashSet<ServiceStaff> serviceStaffList = new HashSet<>();

    public Zoo(int cellsNumber, int food) {
        for (int i = 1; i <= cellsNumber; i++) {
            cells.add(new Cell(1));
        }
        this.food = food;
    }

    public void addCell(int cellsNumber, int capacity) {
        for (int i = 1; i <= cellsNumber; i++) {
            cells.add(new Cell(capacity));
        }
    }

    public void addCleaner(String name, int age, int experience, int ShitPerDayAmount) {
        ServiceStaff serviceStaff = new ServiceStaff(name, age, experience, new Date(), ShitPerDayAmount, this.cells);
        serviceStaffList.add(serviceStaff);
    }

    public int getFood() {
        return food;
    }

    public void setFood() {
        this.food = food;
    }

    public HashSet<Cell> getCells() {
        return cells;
    }

    public int getAveragePurity() {
        return averagePurity;
    }

    public void setPurity() {
        this.averagePurity = averagePurity;
    }

    public void addAnimal(Animal animal) {
        boolean isAnimalAdded = false;
        for (Cell cell : this.cells) {
            if (!isAnimalAdded) { //for (int busySell=0; busySell < capacity ; busySell++) {
                isAnimalAdded = cell.addAnimal(animal);
            }
        }
        if (!isAnimalAdded) {
            System.out.println("Нет места для животного");
        }
    }

    public void addAnimals(List<Animal> animals) {
        boolean isAnimalAdded = false;
        for (Cell cell : this.cells) {
            if (!isAnimalAdded) {
                isAnimalAdded = cell.addAnimals(animals);
            }
        }
        if (!isAnimalAdded) {
            System.out.println("Нет места для животного");
        }
    }

    public int getCellsCount() {
        return cells.size();
    }

    // Add stream.reduce
    public int getEmptyCellsCount() {
        int count = 0;
        for (Cell cell : this.cells) {
            if (cell.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    // Add reduce
    public String getAnimalTypes() {
        String types = "";
        for (Cell cell : this.cells) {
            String animalType = cell.getAnimalsType().substring(cell.getAnimalsType().lastIndexOf('.') + 1);
            types = types.concat(animalType).concat(" ");
        }
        return types;
    }

    public void printZooStatus() {
        ZooStatus zooStatus = new ZooStatus(
                this.foodPerDay(),
                this.cells.size(),
                this.getEmptyCellsCount(),
                this.getAnimalTypes(),
                this.food,
                this.averagePurity
        );
        zooStatus.printToJSON();
    }

    public void updateFood() {
        int allAnimalFoodPerDay = 0;
        for (Cell cell: this.cells) {
            int animalFoodNeed = cell.getAnimalFoodDay();
            allAnimalFoodPerDay = allAnimalFoodPerDay + animalFoodNeed;
        } this.food = food - allAnimalFoodPerDay;
    }

    public int foodPerDay (){
        int allAnimalFoodPerDay = 0;
        for (Cell cell: this.cells) {
            int animalFoodNeed = cell.getAnimalFoodDay();
            allAnimalFoodPerDay = allAnimalFoodPerDay + animalFoodNeed;}
        return allAnimalFoodPerDay;
    }




    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doZooDaily(this);
    }

    public void updatePurity() {
        int allAnimalsPurity = 0;
        for (Cell cell : this.cells) {
            allAnimalsPurity = allAnimalsPurity + cell.getPurity();
        }
        this.averagePurity = allAnimalsPurity / this.cells.size();
    }

    public HashSet<ServiceStaff> getCleaners() {
        return this.serviceStaffList;
    }
}

