package by.home.zoo.repository;

import by.home.zoo.entity.BankAccount;
import org.springframework.data.repository.CrudRepository;


/**
 * JPA repository for tour entity
 */
public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {


}
