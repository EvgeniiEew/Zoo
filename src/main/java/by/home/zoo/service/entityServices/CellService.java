package by.home.zoo.service.entityServices;


import by.home.zoo.entity.Cell;
import by.home.zoo.repository.CellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Tour service class
 */
@Service
public class CellService{

    @Autowired
    private CellRepository repository;

    public void delete(Cell deleted) {
        repository.delete(deleted);
    }

    public Iterable<Cell> findAll() {
        return repository.findAll();
    }

    public Cell findOne(Integer id) {
        return repository.findById(id).get();
    }

    public Cell save(Cell persisted) {
        return repository.save(persisted);
    }
}
