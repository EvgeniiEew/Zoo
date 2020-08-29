package by.home.zoo.service;

import by.home.zoo.Cell;
import by.home.zoo.entity.Zoo;
import by.home.zoo.entity.AnimalSpecialist;
import by.home.zoo.entity.Accountant;
import by.home.zoo.entity.ServiceStaff;

public class DailyService {

    public void doFullZooDaily(Zoo zoo) {
        zoo.getCells().forEach(cell -> cell.doDaily(this));
        zoo.getCleaners().forEach(serviceStaff -> serviceStaff.doDaily(this));
        zoo.getBoogalters().forEach(accountant -> accountant.doDaily(this));
        zoo.getAnimalSpecialists().forEach(animalSpecialist -> animalSpecialist.doDaily(this));
        zoo.doDaily(this);
    }

    public void doZooDaily(Zoo zoo) {
        zoo.updatePurity();
    }

    public void doCellDaily(Cell cell) {
        cell.updatePurity();
    }

    public void doAnimalSpecialistDaily(AnimalSpecialist animalSpecialist) {
        animalSpecialist.updateDailyRemainingFood();
        animalSpecialist.feedAnimals();
    }

    public void doCleanerDaily(ServiceStaff serviceStaff) {
        serviceStaff.updateDailyRemainingPurity();
        serviceStaff.cleanCells();
    }

    public void doBoogalterDaily(Accountant accountant) {
        accountant.orderFood();
        accountant.payOutSalary();
        accountant.sellTickets();
    }
}
