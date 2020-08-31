//package by.home.zoo.util.model;
//import by.home.zoo.dao.SupplyStorageDAO;
//
//import java.util.List;
//
//    public class HibernateSessionFactoryUtilServise {
//    private SupplyStorageDAO supplyStorageDAO = new SupplyStorageDAO();
//
//    public HibernateSessionFactoryUtilServise() {
//    }
//
//    public DataModelSupplyStorage findStorage(int id) {
//        return SupplyStorageDAO.findById(id);
//    }
//
//    public void saveDataModelSupplyStorage(DataModelSupplyStorage user) {
//        SupplyStorageDAO.save(user);
//    }
//
//    public void deleteDataModelSupplyStorage(DataModelSupplyStorage user) {
//        SupplyStorageDAO.delete(user);
//    }
//
//    public void updateDataModelSupplyStorage(DataModelSupplyStorage user) {
//        SupplyStorageDAO.update(user);
//    }
//
//    public List<DataModelSupplyStorage> findAllUsers() {
//        return SupplyStorageDAO.findAll();
//    }
//
//    public DataModelSupplyStorage findAutoById(int id) {
//        return SupplyStorageDAO.findAutoById(id);
//    }
//}
