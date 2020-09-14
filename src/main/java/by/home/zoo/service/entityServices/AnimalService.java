package by.home.zoo.service.entityServices;

import by.home.zoo.entity.Animal;
import by.home.zoo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Guide service class
 */
@Service
public class AnimalService {


    @Autowired
    private AnimalRepository repository;

    public void delete(Animal deleted) {
        repository.delete(deleted);
    }

    public Iterable<Animal> findAll() {
        return repository.findAll();
    }

    public Animal findOne(Long id) {
        return repository.findById(id).get();
    }

    public Animal save(Animal persisted) {
        return repository.save(persisted);
    }
}
