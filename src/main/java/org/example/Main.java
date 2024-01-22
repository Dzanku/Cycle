package org.example;

public class Main {
    public static void main(String[] args) {
        int count = WeekendsService.calculateMoneyMonths(10000, 3000, 20000);
        System.out.println("Сколько месяцев можно отдохнуть в год " + count);
    }
}



