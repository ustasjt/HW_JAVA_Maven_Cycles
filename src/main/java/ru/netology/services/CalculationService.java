package ru.netology.services;

public class CalculationService {
    int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (balance < threshold) {
                balance += income;
                balance -= expenses;
            } else {
                balance -= expenses;
                balance /= 3;
                counter++;
            }

        }
        return counter;
    }
}
