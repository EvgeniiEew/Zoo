package by.home.zoo.service.entityServices;

import by.home.zoo.entity.AnimalSpecialist;
import by.home.zoo.repository.AnimalSpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Roles service class
 */
@Service
public class AnimalSpecialistService  {
    @Autowired
    private AnimalSpecialistRepository repository;

    public void delete(AnimalSpecialist deleted) {
        repository.delete(deleted);
    }

    public Iterable<AnimalSpecialist> findAll() {
        return repository.findAll();
    }

    public AnimalSpecialist findOne(Integer id) {
        return repository.findById(id).get();
    }

    public AnimalSpecialist save(AnimalSpecialist persisted) {
        return repository.save(persisted);
    }
}