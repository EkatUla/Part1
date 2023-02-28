package ru.test.irrigation.service.impl;

import ru.test.irrigation.model.Season;
import ru.test.irrigation.model.WetSensor;
import ru.test.irrigation.service.InputService;
import ru.test.irrigation.service.IrrigationService;

import java.time.LocalDate;

public class IrrigationServiceImpl implements IrrigationService {

    private final InputService inputService;
    private final WetSensor wetSensor;

    public IrrigationServiceImpl(InputService inputService, WetSensor wetSensor) {
        this.inputService = inputService;
        this.wetSensor = wetSensor;

    }

    public static IrrigationService getDefault() {
        return new IrrigationServiceImpl(new InputServiceImpl(), new WetSensor());
    }

    @Override
    public void process() {
        LocalDate prevDate = inputService.askPrevDate();
        Season season = Season.defineSeason(prevDate.getMonthValue());
        LocalDate nextDate = switch (season) {
            case WINTER ->  prevDate.plusMonths(1);
            case FALL, SPRING -> prevDate.plusWeeks(1);
            case SUMMER -> wetSensor.getWetLevel() < 30 ? LocalDate.now() : prevDate.plusDays(2);
        };
        if (nextDate.isBefore(LocalDate.now())) {
            nextDate = LocalDate.now();
        }
        System.out.println("Next wet day is: " + nextDate);
    }


}
