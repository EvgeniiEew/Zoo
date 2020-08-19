package by.home.zoo;

import by.home.zoo.interfaces.Daily;
import by.home.zoo.models.animals.Animal;
import by.home.zoo.service.DailyService;

import java.util.ArrayList;
import java.util.List;

import static by.home.zoo.util.CommonUtils.isListWithObjectType;
import static by.home.zoo.util.CommonUtils.isObjectsClassesEquals;

public class Cell implements Daily {

    private final List<Animal> animalList = new ArrayList<>();
    private int capacity = 1;/// int , not null
    private int purity = 100;//
    private int food = 0;//

    public Cell(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEmptyPlaces() {
        return this.capacity - this.getAnimalsCount();
    }

    public String getAnimalsType() { //получить тип животных
        if (!animalList.isEmpty()) {
            return animalList.get(0).getClass().getName();
        }
        return "";
    }

    public void addFood(int food){
        this.food =this.food + food;
    }

    public int getNecessaryDailyFood() {
        return this.animalList.stream().map(animal -> animal.eatFoodPerDay).reduce((a, b) -> a + b).get();
    }

    public int getAnimalsCount() { //получиьь количество животных
        return animalList.size();
    }

    public boolean isClean() {
        return this.purity == 100;
    }

    public boolean isEmpty() {
        return animalList.isEmpty();
    }

    public boolean addAnimal(Animal animal) { //добавитьь живность
        if (animalList.isEmpty()) {  //Энимал лист пустой?
            return animalList.add(animal); // добавить животного
        }
        if (isObjectsClassesEquals(animalList.get(0), animal)) { // Если живность одного класса , тодобавитьживность
            return animalList.add(animal);
        }
        return false;
    }

    public boolean addAnimals(List<Animal> animals) {
        if (animalList.isEmpty()) {
            return animalList.addAll(animals);
        }
        if (isListWithObjectType(animals, animalList.get(0))) {
            return animalList.addAll(animals);
        }
        return false;
    }

    public Animal takeOutAnimal() {
        if (!animalList.isEmpty()) {
            return animalList.remove(0);
        }
        return null;
    }

    public int getPurity() {
        return this.purity;
    }

    public void updatePurity() {
        this.purity = purity - this.animalList.stream().map(Animal::getDoDirtPerDay).reduce(Integer::sum).get();
    }

    public int getAllAnimalsDirt() {
        return this.animalList.stream().map(Animal::getDoDirtPerDay).reduce(Integer::sum).get();
    }

    @Override
    public void doDaily(DailyService dailyService) {
        dailyService.doCellDaily(this);
    }

    public int clean(int purityAmount) {
        this.purity = this.purity + purityAmount;
        if (this.purity > 100) {
            int remainingPurity = 0;
            remainingPurity = this.purity - 100;
            this.purity = 100;
            return remainingPurity;
        }
        return 0;
    }
}


