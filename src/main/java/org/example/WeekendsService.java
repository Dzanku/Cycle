package org.example;

public class WeekendsService {
    public static int calculateMoneyMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        float money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold && money >= expenses) { // можем ли отдыхать?
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}


