package org.example.MavenPrj;

import org.example.WeekendsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class WeekendsServiceTest {
    @Test
    public void shouldCalculateMoneyMonths1() {
        WeekendsServiceTest service = new WeekendsServiceTest();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int count = WeekendsService.calculateMoneyMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, count);
    }

    @Test
    public void shouldCalculateMoneyMonths2() {
        WeekendsServiceTest service = new WeekendsServiceTest();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int count = WeekendsService.calculateMoneyMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, count);
    }
}
