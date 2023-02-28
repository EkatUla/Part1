package ru.wall;

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        int letters = 15;
        int whitespace = 3;
        int suggestionLength = ((letters / 3) * 62) + (whitespace * 12);
        System.out.println(suggestionLength + " длинна предложения");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите длинну забора - положительное, целое число в сантиметрах без пробелов: ");
            String lengthUser = sc.nextLine();
            int enterInt = Integer.parseInt(lengthUser);
            if (enterInt < suggestionLength) {
                System.out.println("Жаль на забор длинной " + enterInt + " см не поментиться предложение");
            } else {
                System.out.println("Здорово на таком заборе предложение поместиться");
            }
            //throw new RuntimeException();
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число или пробел или число с пробелом или десятичное число, попробуйте снова ввести целое число без пробелов");
        } //catch (Exception e) {
        //System.out.println("Undefined error");
        //}

    }

}
