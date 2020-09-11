package by.home.zoo.repository;

import by.home.zoo.entity.VisitorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * JPA repository for visitor entity
 */
public interface VisitorRepository extends CrudRepository<VisitorEntity, Long> {

    VisitorEntity findByUsername(String username);

    List<VisitorEntity> findAllByOrderByFio();
}
