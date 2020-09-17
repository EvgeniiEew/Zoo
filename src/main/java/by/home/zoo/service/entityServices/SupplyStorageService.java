package by.home.zoo.service.entityServices;


import by.home.zoo.entity.SupplyStorage;
import by.home.zoo.repository.SupplyStorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Visitor service class
 */
@Service
public class SupplyStorageService{
    @Autowired
    private SupplyStorageRepository repository;

    public void delete(SupplyStorage deleted) {
        repository.delete(deleted);
    }

    public Iterable<SupplyStorage> findAll() {
        return repository.findAll();
    }

    public SupplyStorage findOne(Integer id) {
        return repository.findById(id).get();
    }

    public SupplyStorage save(SupplyStorage persisted) {
        return repository.save(persisted);
    }
}
