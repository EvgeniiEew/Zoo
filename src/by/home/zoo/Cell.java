package by.home.zoo;

import by.home.zoo.impl.animals.Shark;
import by.home.zoo.models.animals.Animal;

import java.util.ArrayList;
import java.util.List;

import static by.home.zoo.util.CommonUtils.isListWithObjectType;
import static by.home.zoo.util.CommonUtils.isObjectsClassesEquals;

public class Cell {
    List<Animal> animalList = new ArrayList<>();

    public String getAnimalsType() {
        if (!animalList.isEmpty()) {
            return animalList.get(0).getClass().getName();
        }
        return "";
    }

    public int getAnimalsCount() {
        return animalList.size();

    }

    public boolean addAnimal(Animal animal) {
        if (animalList.isEmpty()) {
            return animalList.add(animal);
        }
        if ( isObjectsClassesEquals(animalList.get(0), animal)) {
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


