package by.home.zoo.dao;

import by.home.zoo.entity.SupplyStorage;
import by.home.zoo.service.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SupplyStorageDAO {
    public SupplyStorage findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(SupplyStorage.class, id);
    }

    public void save(SupplyStorage supplyStorage) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(supplyStorage);
        tx1.commit();
        session.close();
    }

    public void update(SupplyStorage supplyStorage) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(supplyStorage);
        tx1.commit();
        session.close();
    }

    public void delete(SupplyStorage supplyStorage) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(supplyStorage);
        tx1.commit();
        session.close();
    }

    public SupplyStorage findAutoById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(SupplyStorage.class, id);
    }

    public List<SupplyStorage> findAll() {
        List supplyStorageList = (List<SupplyStorage>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("FROM SupplyStorage").list();
        return supplyStorageList;
    }
}

