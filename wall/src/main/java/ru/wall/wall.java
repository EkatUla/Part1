package ru.wall;

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        int letters = 15;
        int whitespace = 3;
        int suggestionLength = ((letters / 3) * 62) + (whitespace * 12);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите длинну забора в сантиметрах: ");
            String lengthUser = sc.nextLine();
            int enterInt = Integer.parseInt(lengthUser);
            if (enterInt <= suggestionLength) {
                System.out.println("Ваше предложение поместиться на заборе");
            } else {
                System.out.println("Ваше предложение слишном длинное и НЕ поместиться на заборе");
            }
            //throw new RuntimeException();
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число или пробел, попробуйте снова ввести целое число ");
        } //catch (Exception e) {
        //System.out.println("Undefined error");
        //}

    }
}
