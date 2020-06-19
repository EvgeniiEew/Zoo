package by.home.zoo;

import by.home.zoo.interfaces.Daily;
import by.home.zoo.models.animals.Animal;
import by.home.zoo.service.DailyService;

import java.util.HashSet;
import java.util.List;

public class Zoo implements Daily { //закрытый конструктор, открытый статический член
    private int food;
    private int averagePurity = 100;
    HashSet<Cell> cells = new HashSet<>();

    public Zoo(int cellNumber, int food) {
        for (int i = 1; i <= cellNumber; i++) {
            cells.add(new Cell(1));
        }
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood() {
        this.food = food;
    }

    public int getAveragePurity() {
        return averagePurity;
    }

    public void setPurity() {
        this.averagePurity = averagePurity;
    }

    public void dayGone(Cell cell) {
        System.out.println("день прошел");
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

    public int getEmptyCellsCount() {
        int count = 0;
        for (Cell cell : this.cells) {
            if (cell.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public String getAnimalTypes() {
        String types = "";
        for (Cell cell : this.cells) {
            String animalType = cell.getAnimalsType().substring(cell.getAnimalsType().lastIndexOf('.') + 1);
            types = types.concat(animalType).concat(" ");
        }
        return types;
    }

    public void printZooStatus() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Статус зоопарка \n");
        stringBuilder.append("\nКоличество клеток - ").append(this.getCellsCount());
        stringBuilder.append("\nКоличество пустых клеток - ").append(this.getEmptyCellsCount());
        stringBuilder.append("\nВиды животных в клетках - ").append(this.getAnimalTypes());
        stringBuilder.append("\nКоличество еды - ").append(this.food);
        stringBuilder.append("\nПроцент чистоты - ").append(this.averagePurity);
        System.out.println(stringBuilder.toString());
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
}

