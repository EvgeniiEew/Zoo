package by.home.zoo.repository;

import by.home.zoo.entity.Animal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * JPA repository for guide entity
 */
public interface AnimalRepository extends CrudRepository<Animal, Long> {

    Animal findByUsername (String username);

    List<Animal> findAllByOrderByFio();
}
