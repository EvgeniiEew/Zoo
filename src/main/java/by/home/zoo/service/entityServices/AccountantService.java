package by.home.zoo.service.impl;

import by.home.zoo.entity.Accountant;
import by.home.zoo.repository.AccountantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Accountant service class
 */
@Service
public class AccountantServiceImpl {
    @Autowired
    private AccountantRepository repository;

    public void delete(Accountant deleted) {
        repository.delete(deleted);
    }

    public Iterable<Accountant> findAll() {
        return repository.findAllByOrderByTitle();
    }

    public Accountant findOne(Long id) {
        return repository.findById(id).get();
    }

    public Accountant save(Accountant persisted) {
        return repository.save(persisted);
    }
}
