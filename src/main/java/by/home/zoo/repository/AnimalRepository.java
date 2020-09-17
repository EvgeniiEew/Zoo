package by.home.zoo.repository;

import by.home.zoo.entity.Animal;
import org.springframework.data.repository.CrudRepository;


/**
 * JPA repository for guide entity
 */
public interface AnimalRepository extends CrudRepository<Animal, Integer> {


}
