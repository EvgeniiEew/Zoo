package by.home.zoo.dao;

import by.home.zoo.entity.BankAccount;
import by.home.zoo.service.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BankAccountDAO {
    public BankAccountDAO findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(BankAccountDAO.class, id);
    }

    public void save(BankAccountDAO bankAccount) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(bankAccount);
        tx1.commit();
        session.close();
    }

    public void update(BankAccountDAO bankAccount) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(bankAccount);
        tx1.commit();
        session.close();
    }

    public void delete(BankAccountDAO bankAccount) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(bankAccount);
        tx1.commit();
        session.close();
    }

    public BankAccountDAO findAutoById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(BankAccountDAO.class, id);
    }

    public List<BankAccountDAO> findAll() {
        List BankAccountList = (List<BankAccountDAO>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("FROM BankAccount").list();
        return BankAccountList;
    }
}
