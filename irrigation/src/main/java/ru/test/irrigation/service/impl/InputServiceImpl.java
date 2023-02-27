package ru.test.irrigation.service.impl;

import ru.test.irrigation.exception.BusinessException;
import ru.test.irrigation.service.InputService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputServiceImpl implements InputService {

    private final Scanner sc = new Scanner(System.in);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public LocalDate askPrevDate() {
        try {
            System.out.println("Введите предыдущую дату полива в формате dd-MM-yyyy: ");
            String prevDateString = sc.nextLine();
            return LocalDate.parse(prevDateString, formatter);
        } catch (Exception e) {
            throw new BusinessException("Не корректный ввод, попробуйте снова, введя дату в формате dd-MM-yyyy");
        }
    }
}
