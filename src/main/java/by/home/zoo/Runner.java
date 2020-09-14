package by.home.zoo;

import by.home.zoo.config.DataConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
//        SupplyStorageDAO supplyStorageDAO = new SupplyStorageDAO();
       // System.out.println( context.toString());
//        List supplyStorageList = supplyStorageDAO.findAll();
//        System.out.println(supplyStorageList);
    }
}

