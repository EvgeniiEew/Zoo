package by.home.zoo.service.entityServices;

import by.home.zoo.entity.BankAccount;
import by.home.zoo.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SignUp service class
 */
@Service
public class BankAccountService  {

    @Autowired
    private BankAccountRepository repository;

    public void delete(BankAccount deleted) {
        repository.delete(deleted);
    }

    public Iterable<BankAccount> findAll() {
        return repository.findAll();
    }

    public BankAccount findOne(Long id) {
        return repository.findById(id).get();
    }

    public BankAccount save(BankAccount persisted) {
        return repository.save(persisted);
    }
}
