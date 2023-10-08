package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RestMonthCounterTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/counter.csv")
    public void testThreeMonthsRest(int income, int expenses, int threshold, int expected) {
        RestMonthCounter service = new RestMonthCounter();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}