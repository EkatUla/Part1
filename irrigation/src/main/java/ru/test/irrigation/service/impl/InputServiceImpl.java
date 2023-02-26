package ru.test.irrigation.service.impl;

import ru.test.irrigation.service.InputService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputServiceImpl implements InputService {

    private final Scanner sc = new Scanner(System.in);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public LocalDate askPrevDate() {
        System.out.println("Enter prev date: ");
        String prevDateString = sc.nextLine();

        try {
            return LocalDate.parse(prevDateString, formatter);
        } catch (Exception e) {
            System.out.println("Error");
        }
        return null;
    }
}
