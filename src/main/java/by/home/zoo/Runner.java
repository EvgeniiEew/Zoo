package by.home.zoo;

import by.home.zoo.config.DataConfig;
import by.home.zoo.entity.Zoo;
import by.home.zoo.service.entityServices.ZooService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        ZooService zooService = context.getBean(ZooService.class);
        Zoo zoo = zooService.findOne(1);
        System.out.println(zoo.getAveragePurity());
    }
}

