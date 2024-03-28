package com.example.Neoflex;

import lombok.Data;
@Data
public class VacationResponse {

    final double vacationPay;

    public VacationResponse(double vacationPay) {
        this.vacationPay = vacationPay;
    }

}