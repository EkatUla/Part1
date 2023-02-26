package ru.test.irrigation.model;

public enum Season {

    WINTER, FALL, SPRING, SUMMER;

    public static Season defineSeason(int month) {
        return switch (month) {
            case 1, 2, 12 -> WINTER;
            case 3, 4, 5 -> SPRING;
            case 6, 7, 8 -> SUMMER;
            case 9, 10, 11 -> FALL;
            default -> throw new IllegalArgumentException("Season of year in undefined");
        };
    }
}
