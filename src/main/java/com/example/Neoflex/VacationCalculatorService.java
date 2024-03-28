package com.example.Neoflex;

import org.springframework.stereotype.Service;

@Service
public class VacationCalculatorService {
    static final double AVERAGE_MONTH_DAYS = 29.3;
    public double calculateVacationPay(double averageSalary, int vacationDays) {
        if (averageSalary < 0 || vacationDays < 0) {
            throw new IllegalArgumentException("Average salary and vacation days must be non-negative.");
        }
        return (averageSalary / AVERAGE_MONTH_DAYS * vacationDays);
    }
}
    