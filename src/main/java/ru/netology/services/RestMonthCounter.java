package ru.netology.services;

public class RestMonthCounter {
    public int calculate(int income, int expenses, int threshold) {
        int rest = 0; // месяцы отдыха
        int bank = 0; //сумма на счету
        for (int i = 0; i < 12; i++) {
            if (bank >= threshold) { //отдыхает
                bank = bank - expenses;
                bank = bank / 3;
                rest++;
            } else { //работает
                bank = bank + income;
                bank = bank - expenses;

            }
        }
        return rest;
    }


}
