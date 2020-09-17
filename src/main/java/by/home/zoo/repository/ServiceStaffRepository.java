package by.home.zoo.repository;

import by.home.zoo.entity.ServiceStaff;
import org.springframework.data.repository.CrudRepository;

/**
 * JPA repository for visitor entity
 */
public interface ServiceStaffRepository extends CrudRepository<ServiceStaff, Integer> {
}