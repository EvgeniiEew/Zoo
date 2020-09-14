package by.home.zoo.repository;

import by.home.zoo.entity.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}

