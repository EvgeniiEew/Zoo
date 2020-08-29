package by.home.zoo.util;

import by.home.zoo.entity.Animal;

import java.util.List;

public class CommonUtils {
    public static boolean isObjectsClassesEquals(Object object1, Object object2) {

        String object1Class = object1.getClass().toString();
        String object2Class = object2.getClass().toString();
        return object1Class.equals(object2Class);
    }

    public static boolean isListWithObjectType(List<Animal> objectList, Animal object1) {
        for (Animal obj : objectList) {
            if (!isObjectsClassesEquals(obj, object1)) {
                return false;
            }
        }
        return true;
    }
}
