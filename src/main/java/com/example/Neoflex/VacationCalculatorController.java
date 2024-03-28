package com.example.Neoflex;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VacationCalculatorController {

    @Autowired
    private final VacationCalculatorService vacationCalculatorService;

    public VacationCalculatorController(VacationCalculatorService vacationCalculator) {
        this.vacationCalculatorService = vacationCalculator;
    }

    @GetMapping("/calculate")
    public VacationResponse calculateVacationPay(@RequestParam(required = true) @Min(0) double averageSalary,
                                                 @RequestParam(required = true) @Min(0) @Max(31) int vacationDays) {
        double vacationPay = vacationCalculatorService.calculateVacationPay(averageSalary, vacationDays);
        return new VacationResponse(vacationPay);
    }

}