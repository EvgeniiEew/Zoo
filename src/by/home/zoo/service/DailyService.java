package by.home.zoo.service;

import by.home.zoo.Cell;
import by.home.zoo.Zoo;
import by.home.zoo.impl.humens.Cleaner;

public class DailyService {

    public void doFullZooDaily(Zoo zoo) {
        zoo.getCells().forEach(cell -> cell.doDaily(this));
        zoo.getCleaners().forEach(cleaner -> cleaner.doDaily(this));
        zoo.doDaily(this);
    }

    public void doZooDaily(Zoo zoo) {
        zoo.updatePurity();
    }

    public void doCellDaily(Cell cell) {
        cell.updatePurity();
    }

    public void doCleanerDaily(Cleaner cleaner) {
        cleaner.updateDailyRemainingPurity();
        cleaner.cleanCells();
    }
}
