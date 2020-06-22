package by.home.zoo.service;

import by.home.zoo.Cell;
import by.home.zoo.Zoo;

public class DailyService {

    public void doFullZooDaily(Zoo zoo) {
        zoo.getCells().forEach(cell -> cell.doDaily(this));
        zoo.doDaily(this);
    }

    public void doZooDaily(Zoo zoo) {
        zoo.updatePurity();
    }

    public void doCellDaily(Cell cell) {
        cell.updatePurity();
    }
}
