package ru.test.irrigation.model;

import java.util.Random;

public class WetSensor {

    private final Random random = new Random();

    public int getWetLevel() {
        int wetLevel = random.nextInt(100);
        System.out.println("wet level is " + wetLevel);
        return wetLevel;
    }
}
