package by.home.zoo.entity;

import java.io.*;

import com.google.gson.Gson;

import javax.persistence.*;

@Entity
@Table(name = "accountants")
public class ZooLog {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cell_count")
    private int cellsCount;

   @Column(name = "empty_cells_count")
    private int emptyCellsCount;

   @Column(name = "existing_animal_types")
    private String existingAnimalTypes;

    @Column(name = "food_count")
    private int foodCount;

    @Column(name = "purity_percentage")
    private int purityPercentage;

    @Column(name = "food_per_day")
    private int foodPerDay;

    @Column(name = "dirt_per_day")
    private int dirtPerDay;

    @Column(name = "zoo_money")
    private long zooMoney;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    public ZooLog() {
    }

    public ZooLog(int cellsCount, int emptyCellsCount, String existingAnimalTypes, int foodCount, int purityPercentage, int foodPerDay, int dirtPerDay, long zooMoney, Zoo zoo) {
        this.cellsCount = cellsCount;
        this.emptyCellsCount = emptyCellsCount;
        this.existingAnimalTypes = existingAnimalTypes;
        this.foodCount = foodCount;
        this.purityPercentage = purityPercentage;
        this.foodPerDay = foodPerDay;
        this.dirtPerDay = dirtPerDay;
        this.zooMoney = zooMoney;
        this.zoo = zoo;
    }

//    public void printToConsole() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Статус зоопарка \n");
//        stringBuilder.append("\nКоличество клеток - ").append(this.cellsCount);
//        stringBuilder.append("\nКоличество пустых клеток - ").append(this.emptyCellsCount);
//        stringBuilder.append("\nВиды животных в клетках - ").append(this.existingAnimalTypes);
//        stringBuilder.append("\nКоличество еды - ").append(this.foodCount);
//        stringBuilder.append("\nПроцент чистоты - ").append(this.purityPercentage);
//        System.out.println(stringBuilder.toString());
//    }
//
//    public void printToJSON() {
//        Gson gson = new Gson();
//        String jsonString = gson.toJson(this);
//        System.out.println(jsonString);
//        try (FileWriter writer = new FileWriter("C:/Users/Jack/Desktop/Zoo/src/main/resources/report.json", true)) {
//            writer.write(jsonString);
//            writer.append('\n');
//
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
}

//    public void saveToDataBase(){};
