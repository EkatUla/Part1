package ru.test.irrigation;

import ru.test.irrigation.service.IrrigationService;
import ru.test.irrigation.service.impl.IrrigationServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        IrrigationService irrigationService = IrrigationServiceImpl.getDefault();
        irrigationService.process();
        System.out.println("GoodBay!");
    }
}
