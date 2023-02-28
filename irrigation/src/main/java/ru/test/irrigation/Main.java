package ru.test.irrigation;

import ru.test.irrigation.service.IrrigationService;
import ru.test.irrigation.service.impl.IrrigationServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        try {
            IrrigationService irrigationService = IrrigationServiceImpl.getDefault();
            irrigationService.process();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBay!");
    }
}
