package by.home.zoo.repository;


import by.home.zoo.entity.Cell;
import org.springframework.data.repository.CrudRepository;

/**
 * JPA repository for users entity
 */
public interface CellRepository extends CrudRepository<Cell, Integer> {

}
