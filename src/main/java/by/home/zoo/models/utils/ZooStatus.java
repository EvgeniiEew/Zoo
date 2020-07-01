package by.home.zoo.models.utils;

import com.google.gson.Gson;

public class ZooStatus {
    public int cellsCount;
    public int emptyCellsCount;
    public String existingAnimalTypes;
    public int foodCount;
    public int purityPercentage;

    public ZooStatus(int cellsCount,
                     int emptyCellsCount,
                     String existingAnimalTypes,
                     int foodCount,
                     int purityPercentage) {
        this.cellsCount = cellsCount;
        this.emptyCellsCount = emptyCellsCount;
        this.existingAnimalTypes = existingAnimalTypes;
        this.foodCount = foodCount;
        this.purityPercentage = purityPercentage;
    }

    public void printToConsole() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Статус зоопарка \n");
        stringBuilder.append("\nКоличество клеток - ").append(this.cellsCount);
        stringBuilder.append("\nКоличество пустых клеток - ").append(this.emptyCellsCount);
        stringBuilder.append("\nВиды животных в клетках - ").append(this.existingAnimalTypes);
        stringBuilder.append("\nКоличество еды - ").append(this.foodCount);
        stringBuilder.append("\nПроцент чистоты - ").append(this.purityPercentage);
        System.out.println(stringBuilder.toString());
    }

    public void printToJSON() {
        Gson gson = new Gson();
        String jsonString = gson.toJson(this);
        System.out.println(jsonString); //<-
        //? write to report.json file
    }

//    public void saveToDataBase(){};
}