package by.home.zoo;

import by.home.zoo.models.animals.Animal;

import java.util.ArrayList;
import java.util.List;

import static by.home.zoo.util.CommonUtils.isListWithObjectType;
import static by.home.zoo.util.CommonUtils.isObjectsClassesEquals;

public class Cell {
    List<Animal> animalList = new ArrayList<>();
    int capacity = 0; // сделать копасити поле которое

    public String getAnimalsType() { //получить тип животных
        if (!animalList.isEmpty()) {
            return animalList.get(0).getClass().getName();
        }
        return "";
    }

    public int getAnimalsCount() { //получиьь количество животных
        return animalList.size();
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


}


