package by.home.zoo.service;

import by.home.zoo.Cell;
import by.home.zoo.Zoo;

public class DailyService {

    public void doZooDaily(Zoo zoo) {
        zoo.updatePurity();
    }

    public void doCellDaily(Cell cell) {
        cell.updatePurity();
    }
}
