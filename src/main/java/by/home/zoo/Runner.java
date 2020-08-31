package by.home.zoo;

import by.home.zoo.dao.SupplyStorageDAO;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        SupplyStorageDAO supplyStorageDAO = new SupplyStorageDAO();
        List supplyStorageList = supplyStorageDAO.findAll();
        System.out.println(supplyStorageList);
    }
}

