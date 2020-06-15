package by.home.zoo;

import by.home.zoo.models.animals.Animal;

import java.util.HashSet;
import java.util.List;

public class Zoo { //закрытый конструктор, открытый статический член
    private int food;
    private byte purity;
    HashSet<Cell> cells = new HashSet<>();

    public Zoo(int cellNumber, int food, byte purity) {
        for (int i = 0; i <= cellNumber; i++) {
            cells.add(new Cell());
        }

        this.food = food;
        this.purity = purity;
    }

    public int getFood() {
        return food;
    }

    public void setFood() {
        this.food = food;
    }

    public byte getPurity() {
        return purity;
    }

    public void setPurity() {
        this.purity = purity;
    }

    public void dayGone(Cell cell) {
        System.out.println("день прошел");

    }

    public void addAnimal(Animal animal) {
        boolean isAnimalAdded = false;
        for (Cell cell : this.cells) {
            if (!isAnimalAdded) {
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

    public void statusZoo() {
        //Zoo.zoo.getCell();
    }


}

