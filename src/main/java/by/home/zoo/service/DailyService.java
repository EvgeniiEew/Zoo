package by.home.zoo.service;

import by.home.zoo.Cell;
import by.home.zoo.Zoo;
import by.home.zoo.impl.humens.ServiceStaff;

public class DailyService {

    public void doFullZooDaily(Zoo zoo) {
        zoo.getCells().forEach(cell -> cell.doDaily(this));

        zoo.getCleaners().forEach(serviceStaff -> serviceStaff.doDaily(this));
        zoo.doDaily(this);
    }

    public void doZooDaily(Zoo zoo) {
        zoo.updatePurity();
        zoo.updateFood();
    }

    public void doCellDaily(Cell cell) {
        cell.updatePurity();
    }

    public void doCleanerDaily(ServiceStaff serviceStaff) {
        serviceStaff.updateDailyRemainingPurity();
        serviceStaff.cleanCells();
    }
}
