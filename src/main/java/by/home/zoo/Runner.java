package by.home.zoo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import by.home.zoo.dao.SupplyStorageDAO;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        SupplyStorageDAO supplyStorageDAO = new SupplyStorageDAO();
//        List supplyStorageList = supplyStorageDAO.findAll();
//        System.out.println(supplyStorageList);
    }
}

