package ru.wall;

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        int letters = 15;
        int whitespace = 3;
        int suggestionLength = ((letters / 3) * 62) + (whitespace * 12);
        System.out.println(suggestionLength);
        System.out.println("Введите длинну забора в сантеметрах: ");
        Scanner sc = new Scanner(System.in);
        int lengthUser = sc.nextInt();
        if(lengthUser > suggestionLength){
            System.out.println("Ваше предложение слишном длинное и НЕ поместиться на заборе");
            }
            else{
            System.out.println("Ваше предложение поместиться на заборе");
        }

        }
    }
