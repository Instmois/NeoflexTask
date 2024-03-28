package com.example.Neoflex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NeoflexApplicationTests {
	private final VacationCalculatorService vacationCalculatorService = new VacationCalculatorService();

	@Test
	void calculateVacationPay_correctCalculation() {
		double averageSalary = 100000;
		int vacationDays = 28;
		double expectedVacationPay = 95563.13;

		double actualVacationPay = vacationCalculatorService.calculateVacationPay(averageSalary, vacationDays);

		assertEquals(expectedVacationPay, actualVacationPay, 0.01);
	}

	@Test
	void calculateVacationPay_zeroSalary() {
		double averageSalary = 0;
		int vacationDays = 28;
		double expectedVacationPay = 0;

		double actualVacationPay = vacationCalculatorService.calculateVacationPay(averageSalary, vacationDays);

		assertEquals(expectedVacationPay, actualVacationPay, 0.01);
	}
	@Test
	void contextLoads() {
	}

}
