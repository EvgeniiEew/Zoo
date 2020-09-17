package by.home.zoo.repository;

import by.home.zoo.entity.Accountant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * JPA repository for exhibit entity
 */
public interface AccountantRepository extends CrudRepository<Accountant, Integer> {

}
