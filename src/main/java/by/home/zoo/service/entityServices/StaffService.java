package by.home.zoo.service.entityServices;


import by.home.zoo.entity.ServiceStaff;
import by.home.zoo.repository.ServiceStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Users service class
 */
@Service
public class StaffService{

    @Autowired
    private ServiceStaffRepository repository;

    public void delete(ServiceStaff deleted) {
        repository.delete(deleted);
    }

    public Iterable<ServiceStaff> findAll() {
        return repository.findAll();
    }

    public ServiceStaff findOne(Integer id) {
        return repository.findById(id).get();
    }

    public ServiceStaff save(ServiceStaff persisted) {
        return repository.save(persisted);
    }
}
