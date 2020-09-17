package by.home.zoo.service.entityServices;

import by.home.zoo.entity.Zoo;
import by.home.zoo.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZooService {
    @Autowired
    private ZooRepository repository;

    public void delete(Zoo deleted) {
        repository.delete(deleted);
    }

    public Iterable<Zoo> findAll() {
        return repository.findAll();
    }

    public Zoo findOne(Integer id) {
        return repository.findById(id).get();
    }

    public Zoo save(Zoo persisted) {
        return repository.save(persisted);
    }
}
