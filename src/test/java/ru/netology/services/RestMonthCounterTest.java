package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RestMonthCounterTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    public void testThreeMonthsRest(int income, int expenses, int threshold, int expected) {
        RestMonthCounter service = new RestMonthCounter();
        int actual = service.calculate(income, expenses, threshold);
//        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testTwoMonthsRest() {
//        RestMonthCounter service = new RestMonthCounter();
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        int expected = 2;
//
//        Assertions.assertEquals(expected, actual);
//    }
}