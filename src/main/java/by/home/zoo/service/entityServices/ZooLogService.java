package by.home.zoo.service.entityServices;

import by.home.zoo.entity.ZooLog;
import by.home.zoo.repository.ZooLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ZooLogService {
    @Autowired
    private ZooLogRepository repository;

    public void delete(ZooLog deleted) {
        repository.delete(deleted);
    }

    public Iterable<ZooLog> findAll() {
        return repository.findAll();
    }

    public ZooLog findOne(Long id) {
        return repository.findById(id).get();
    }

    public ZooLog save(ZooLog persisted) {
        return repository.save(persisted);
    }
}

