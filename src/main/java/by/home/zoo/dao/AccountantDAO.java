package by.home.zoo.dao;

import by.home.zoo.entity.BankAccount;
import by.home.zoo.entity.SupplyStorage;
import by.home.zoo.service.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;


public class AccountantDAO {
    public AccountantDAO findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(AccountantDAO.class, id);
    }

    public void save(AccountantDAO accountant) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(accountant);
        tx1.commit();
        session.close();
    }

    public void update(AccountantDAO accountant) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(accountant);
        tx1.commit();
        session.close();
    }

    public void delete(AccountantDAO accountant) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(accountant);
        tx1.commit();
        session.close();
    }

    public AccountantDAO findAutoById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(AccountantDAO.class, id);
    }

    public List<AccountantDAO> findAll() {
        List AccountantList = (List<AccountantDAO>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("FROM Accountant").list();
        return AccountantList;
    }
}
